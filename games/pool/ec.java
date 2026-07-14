/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec implements eb {
    static byte[][] field_g;
    static dd field_d;
    static char[] field_j;
    static int field_f;
    private int field_e;
    static int field_b;
    static String field_k;
    static int field_i;
    private al field_h;
    static int field_c;
    private pq field_a;

    final static void a(int param0, int param1, int param2, String[] param3, java.applet.Applet param4, int param5) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Pool.field_O;
          sa.field_o = param4.getParameter("overxgames");
          if (sa.field_o != null) {
            break L0;
          } else {
            sa.field_o = "0";
            break L0;
          }
        }
        L1: {
          pd.field_e = param4.getParameter("overxachievements");
          if (null != pd.field_e) {
            break L1;
          } else {
            pd.field_e = "0";
            break L1;
          }
        }
        L2: {
          L3: {
            var6 = param4.getParameter("currency");
            if (var6 == null) {
              break L3;
            } else {
              if (ka.a(10, (CharSequence) (Object) var6)) {
                qg.field_e = kq.a((byte) 63, (CharSequence) (Object) var6);
                break L2;
              } else {
                break L3;
              }
            }
          }
          qg.field_e = 2;
          break L2;
        }
        L4: {
          if (param2 == 37) {
            break L4;
          } else {
            field_j = null;
            break L4;
          }
        }
        vc.field_L = param1;
        oo.field_k = param0;
        er.field_X = param5;
        jr.field_m = new dd[param3.length];
        var7 = 0;
        L5: while (true) {
          if (var7 >= param3.length) {
            mk.field_a = param3;
            return;
          } else {
            jr.field_m[var7] = new dd(317, 34);
            var7++;
            continue L5;
          }
        }
    }

    public final void a(int[] param0, int param1) {
        tm stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int[] stackIn_1_3 = null;
        int[] stackIn_1_4 = null;
        tm stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int[] stackIn_2_3 = null;
        int[] stackIn_2_4 = null;
        tm stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int[] stackIn_3_3 = null;
        int[] stackIn_3_4 = null;
        int stackIn_3_5 = 0;
        tm stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int[] stackOut_0_3 = null;
        int[] stackOut_0_4 = null;
        tm stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int[] stackOut_2_3 = null;
        int[] stackOut_2_4 = null;
        int stackOut_2_5 = 0;
        tm stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int[] stackOut_1_3 = null;
        int[] stackOut_1_4 = null;
        int stackOut_1_5 = 0;
        L0: {
          stackOut_0_0 = dq.field_a;
          stackOut_0_1 = -1912602369;
          stackOut_0_2 = ((ec) this).field_e;
          stackOut_0_3 = ((ec) this).field_a.field_G;
          stackOut_0_4 = (int[]) param0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_2_4 = stackOut_0_4;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          stackIn_1_4 = stackOut_0_4;
          if (((ec) this).field_e != ((ec) this).field_h.j(param1 ^ -32240).field_I) {
            stackOut_2_0 = (tm) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = (int[]) (Object) stackIn_2_3;
            stackOut_2_4 = (int[]) (Object) stackIn_2_4;
            stackOut_2_5 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            stackIn_3_5 = stackOut_2_5;
            break L0;
          } else {
            stackOut_1_0 = (tm) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = (int[]) (Object) stackIn_1_3;
            stackOut_1_4 = (int[]) (Object) stackIn_1_4;
            stackOut_1_5 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            stackIn_3_5 = stackOut_1_5;
            break L0;
          }
        }
        L1: {
          ((tm) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_3_5 != 0);
          if ((pd.field_i & 4L ^ -1L) == -1L) {
            break L1;
          } else {
            L2: {
              L3: {
                ((ec) this).field_a.f(param1 ^ 32245);
                if (((ec) this).field_a.field_I != 0) {
                  break L3;
                } else {
                  if (((ec) this).field_a.field_t != 0) {
                    break L3;
                  } else {
                    if (-1 != (((ec) this).field_a.field_e ^ -1)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              cl.a(16711680, 1, param0, ol.a(new int[3], (byte) 1), ol.a(new int[3], (byte) 1));
              break L2;
            }
            L4: {
              L5: {
                if (-1 != ((ec) this).field_a.field_n) {
                  break L5;
                } else {
                  if (-1 != ((ec) this).field_a.field_b) {
                    break L5;
                  } else {
                    if (0 == ((ec) this).field_a.field_K) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              cl.a(65280, 1, param0, ol.a(new int[3], (byte) 1), ol.a(new int[3], (byte) 1));
              break L4;
            }
            L6: {
              if (0 != ((ec) this).field_a.field_l) {
                break L6;
              } else {
                if (-1 == (((ec) this).field_a.field_h ^ -1)) {
                  break L1;
                } else {
                  break L6;
                }
              }
            }
            cl.a(16776960, 1, param0, ol.a(new int[3], (byte) 1), ol.a(new int[3], (byte) 1));
            break L1;
          }
        }
        L7: {
          if (param1 == -32215) {
            break L7;
          } else {
            field_b = 107;
            break L7;
          }
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param0 != 32635) {
            String discarded$0 = ec.a(true);
        }
        return param2 * param2 * (param2 * param3) / param1 / param1 / param1;
    }

    public final int b(int[] param0, int param1) {
        if (param1 > -27) {
            Object var4 = null;
            int discarded$0 = ((ec) this).b((int[]) null, -80);
        }
        return param0[11] * (-param0[2] + ((ec) this).field_a.field_G[2]) + (((ec) this).field_a.field_G[1] - param0[1]) * param0[10] + (((ec) this).field_a.field_G[0] - param0[0]) * param0[9];
    }

    final static String a(byte param0, long param1) {
        long var8 = 0L;
        int var10 = Pool.field_O;
        if (param1 <= 0L) {
            return null;
        }
        if (6582952005840035281L <= param1) {
            return null;
        }
        if ((param1 % 37L ^ -1L) == -1L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (-1L != (var4 ^ -1L)) {
            var4 = var4 / 37L;
            var3++;
        }
        int var7 = 111 / ((-49 - param0) / 63);
        StringBuilder var6 = new StringBuilder(var3);
        while (-1L != (param1 ^ -1L)) {
            var8 = param1;
            param1 = param1 / 37L;
            StringBuilder discarded$0 = var6.append(dp.field_d[(int)(-(37L * param1) + var8)]);
        }
        return var6.reverse().toString();
    }

    final static String a(boolean param0) {
        if (param0) {
            field_j = null;
        }
        return kn.field_e.j(-125);
    }

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        field_j = null;
        field_k = null;
        if (param0 <= 77) {
            field_c = 92;
        }
    }

    ec(int param0, al param1) {
        ((ec) this).field_e = param0;
        ((ec) this).field_h = param1;
        ((ec) this).field_a = ((ec) this).field_h.field_l[((ec) this).field_e];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new byte[50][];
        field_k = "Try again!";
        field_j = new char[]{(char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112};
        field_b = 256;
    }
}
