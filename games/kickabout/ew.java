/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ew {
    private long field_e;
    static String field_d;
    private byte[] field_k;
    private long field_c;
    private long field_m;
    private ao field_j;
    private long field_l;
    private int field_g;
    private int field_b;
    private byte[] field_h;
    private long field_f;
    private long field_i;
    static int field_a;

    final void a(byte param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        } else {
          if (param0 != 4) {
            return;
          } else {
            ((ew) this).field_m = param1;
            return;
          }
        }
    }

    final static void a() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) lw.field_e;
        synchronized (var1) {
          L0: {
            nl.field_p = ao.field_d;
            lb.field_M = lb.field_M + 1;
            el.field_A = vf.field_G;
            n.field_m = gf.field_b;
            el.field_C = rp.field_A;
            rp.field_A = false;
            wj.field_A = vu.field_Fb;
            sm.field_q = fp.field_w;
            vc.field_y = fd.field_l;
            vu.field_Fb = 0;
            break L0;
          }
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var2_int = -11 / ((67 - param0) / 50);
            if (vg.field_Wb) {
              L1: {
                if (ov.field_b != 2) {
                  break L1;
                } else {
                  if (null == qi.field_o) {
                    break L1;
                  } else {
                    var3 = (CharSequence) (Object) param1;
                    if (qi.field_o.equals((Object) (Object) mo.a(0, var3))) {
                      stackOut_9_0 = 1;
                      stackIn_10_0 = stackOut_9_0;
                      break L0;
                    } else {
                      return false;
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("ew.K(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final static void a(int param0, int param1, hu param2, hu param3) {
        try {
            vp.field_k = 320;
            sf.field_F = param3;
            cv.field_f = param2;
            int var4_int = -82;
            bs.a(on.field_f / 2, 0, on.field_g / 2);
            int discarded$0 = 5;
            sb.a(param3.field_L, param3.field_p + param3.field_L, param2.field_L, param2.field_p + param2.field_L);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ew.G(" + 126 + 44 + 320 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    private final void b() throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Kickabout.field_G;
          ((ew) this).field_b = 0;
          if (~((ew) this).field_c != ~((ew) this).field_m) {
            ((ew) this).field_j.a(15557, ((ew) this).field_m);
            ((ew) this).field_c = ((ew) this).field_m;
            break L0;
          } else {
            break L0;
          }
        }
        ((ew) this).field_e = ((ew) this).field_m;
        L1: while (true) {
          L2: {
            if (((ew) this).field_h.length <= ((ew) this).field_b) {
              break L2;
            } else {
              L3: {
                var2 = ((ew) this).field_h.length + -((ew) this).field_b;
                if (var2 <= 200000000) {
                  break L3;
                } else {
                  var2 = 200000000;
                  break L3;
                }
              }
              var3 = ((ew) this).field_j.a(33, var2, ((ew) this).field_h, ((ew) this).field_b);
              if (var3 == -1) {
                break L2;
              } else {
                ((ew) this).field_c = ((ew) this).field_c + (long)var3;
                ((ew) this).field_b = ((ew) this).field_b + var3;
                continue L1;
              }
            }
          }
          return;
        }
    }

    public static void d() {
        field_d = null;
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
            if (param0 <= 57) {
                ((ew) this).field_c = -73L;
            }
            ((ew) this).a(param1.length, 0, (byte) 115, param1);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ew.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void c(int param0) throws IOException {
        this.e(121);
        ((ew) this).field_j.a(param0 ^ -111);
        if (param0 != 1) {
            Object var3 = null;
            boolean discarded$0 = ew.a(60, (String) null);
        }
    }

    final long a(int param0) {
        int var2 = 97 % ((-25 - param0) / 45);
        return ((ew) this).field_f;
    }

    final static void a(boolean param0, sj param1, sj param2) {
        try {
            el.a((hu) (Object) jw.field_Ab, kr.field_b, kn.field_F, uk.field_b, nj.field_d, true, r.field_c, jf.field_B, ul.field_c, dw.field_e, 5, ip.field_c);
            il.field_d = se.a(param1, -127, "lobby", "chatfilter");
            tf.field_h[2] = pa.field_j;
            tf.field_h[0] = gr.field_Q;
            tf.field_h[1] = lk.field_n;
            at.a((hu) (Object) rq.field_E, param2, (byte) -32);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ew.B(" + 1 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final static int a(byte param0, int param1, ml param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int stackIn_1_0 = 0;
        int stackIn_1_1 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        int stackOut_0_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = -128;
              stackOut_0_1 = 0;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (param1 != 0) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1 << -1 + param1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = stackIn_3_2;
              stackOut_3_3 = param4;
              stackOut_3_4 = param1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_5_3 = stackOut_3_3;
              stackIn_5_4 = stackOut_3_4;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              stackIn_4_4 = stackOut_3_4;
              if (0 == param5) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = stackIn_5_4;
                stackOut_5_5 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                stackIn_6_4 = stackOut_5_4;
                stackIn_6_5 = stackOut_5_5;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = stackIn_4_4;
                stackOut_4_5 = 1 << param5 - 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_6_3 = stackOut_4_3;
                stackIn_6_4 = stackOut_4_4;
                stackIn_6_5 = stackOut_4_5;
                break L2;
              }
            }
            L3: {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = stackIn_6_3;
              stackOut_6_4 = stackIn_6_4;
              stackOut_6_5 = stackIn_6_5;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              stackIn_8_4 = stackOut_6_4;
              stackIn_8_5 = stackOut_6_5;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              stackIn_7_4 = stackOut_6_4;
              stackIn_7_5 = stackOut_6_5;
              if (0 != param4) {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = stackIn_8_4;
                stackOut_8_5 = stackIn_8_5;
                stackOut_8_6 = 1 << param4 + -1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                stackIn_9_4 = stackOut_8_4;
                stackIn_9_5 = stackOut_8_5;
                stackIn_9_6 = stackOut_8_6;
                break L3;
              } else {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = stackIn_7_4;
                stackOut_7_5 = stackIn_7_5;
                stackOut_7_6 = 0;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                stackIn_9_3 = stackOut_7_3;
                stackIn_9_4 = stackOut_7_4;
                stackIn_9_5 = stackOut_7_5;
                stackIn_9_6 = stackOut_7_6;
                break L3;
              }
            }
            int discarded$2 = 0;
            stackOut_9_0 = fs.a(stackIn_9_0, stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, param2, param5);
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("ew.D(").append(125).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 0 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_10_0;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var14 = Kickabout.field_G;
        try {
          L0: {
            if (param3.length >= param0 + param1) {
              L1: {
                if (((ew) this).field_l == -1L) {
                  break L1;
                } else {
                  if (~((ew) this).field_m > ~((ew) this).field_l) {
                    break L1;
                  } else {
                    if (~(((ew) this).field_m + (long)param0) >= ~(((ew) this).field_l - -(long)((ew) this).field_g)) {
                      dv.a(((ew) this).field_k, (int)(((ew) this).field_m - ((ew) this).field_l), param3, param1, param0);
                      ((ew) this).field_m = ((ew) this).field_m + (long)param0;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5_long = ((ew) this).field_m;
              var7 = param1;
              var8 = param0;
              if (param2 >= 89) {
                L2: {
                  if (((ew) this).field_m < ((ew) this).field_e) {
                    break L2;
                  } else {
                    if (((ew) this).field_e - -(long)((ew) this).field_b <= ((ew) this).field_m) {
                      break L2;
                    } else {
                      L3: {
                        var9_int = (int)((long)((ew) this).field_b + (((ew) this).field_e + -((ew) this).field_m));
                        if (var9_int > param0) {
                          var9_int = param0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      dv.a(((ew) this).field_h, (int)(((ew) this).field_m + -((ew) this).field_e), param3, param1, var9_int);
                      param0 = param0 - var9_int;
                      param1 = param1 + var9_int;
                      ((ew) this).field_m = ((ew) this).field_m + (long)var9_int;
                      break L2;
                    }
                  }
                }
                L4: {
                  if (((ew) this).field_h.length < param0) {
                    ((ew) this).field_j.a(15557, ((ew) this).field_m);
                    ((ew) this).field_c = ((ew) this).field_m;
                    L5: while (true) {
                      if (param0 <= 0) {
                        break L4;
                      } else {
                        var9_int = ((ew) this).field_j.a(33, param0, param3, param1);
                        if (-1 != var9_int) {
                          ((ew) this).field_m = ((ew) this).field_m + (long)var9_int;
                          ((ew) this).field_c = ((ew) this).field_c + (long)var9_int;
                          param0 = param0 - var9_int;
                          param1 = param1 + var9_int;
                          continue L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                  } else {
                    if (0 >= param0) {
                      break L4;
                    } else {
                      L6: {
                        int discarded$2 = 0;
                        this.b();
                        var9_int = param0;
                        if (((ew) this).field_b < var9_int) {
                          var9_int = ((ew) this).field_b;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      dv.a(((ew) this).field_h, 0, param3, param1, var9_int);
                      ((ew) this).field_m = ((ew) this).field_m + (long)var9_int;
                      param1 = param1 + var9_int;
                      param0 = param0 - var9_int;
                      break L4;
                    }
                  }
                }
                L7: {
                  if (((ew) this).field_l == -1L) {
                    break L7;
                  } else {
                    L8: {
                      if (~((ew) this).field_m <= ~((ew) this).field_l) {
                        break L8;
                      } else {
                        if (0 < param0) {
                          L9: {
                            var9_int = (int)(((ew) this).field_l - ((ew) this).field_m) + param1;
                            if (var9_int <= param0 + param1) {
                              break L9;
                            } else {
                              var9_int = param1 + param0;
                              break L9;
                            }
                          }
                          L10: while (true) {
                            if (var9_int <= param1) {
                              break L8;
                            } else {
                              int incrementValue$3 = param1;
                              param1++;
                              param3[incrementValue$3] = (byte) 0;
                              param0--;
                              ((ew) this).field_m = ((ew) this).field_m + 1L;
                              continue L10;
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    L11: {
                      L12: {
                        var9 = -1L;
                        var11 = -1L;
                        if (~((ew) this).field_l > ~var5_long) {
                          break L12;
                        } else {
                          if ((long)var8 + var5_long > ((ew) this).field_l) {
                            var9 = ((ew) this).field_l;
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (var5_long < ((ew) this).field_l) {
                        break L11;
                      } else {
                        if (var5_long < (long)((ew) this).field_g + ((ew) this).field_l) {
                          var9 = var5_long;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L13: {
                      L14: {
                        if (~var5_long <= ~(((ew) this).field_l - -(long)((ew) this).field_g)) {
                          break L14;
                        } else {
                          if (var5_long + (long)var8 < (long)((ew) this).field_g + ((ew) this).field_l) {
                            break L14;
                          } else {
                            var11 = ((ew) this).field_l + (long)((ew) this).field_g;
                            break L13;
                          }
                        }
                      }
                      if (~((ew) this).field_l <= ~((long)var8 + var5_long)) {
                        break L13;
                      } else {
                        if (var5_long - -(long)var8 > (long)((ew) this).field_g + ((ew) this).field_l) {
                          break L13;
                        } else {
                          var11 = (long)var8 + var5_long;
                          break L13;
                        }
                      }
                    }
                    if (-1L >= var9) {
                      break L7;
                    } else {
                      if (~var11 >= ~var9) {
                        break L7;
                      } else {
                        var13 = (int)(var11 + -var9);
                        dv.a(((ew) this).field_k, (int)(-((ew) this).field_l + var9), param3, (int)(-var5_long + var9) + var7, var13);
                        if (((ew) this).field_m >= var11) {
                          break L7;
                        } else {
                          param0 = (int)((long)param0 - (var11 - ((ew) this).field_m));
                          ((ew) this).field_m = var11;
                          break L7;
                        }
                      }
                    }
                  }
                }
                if (0 < param0) {
                  throw new EOFException();
                } else {
                  break L0;
                }
              } else {
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param0 + (param1 - param3.length));
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ew) this).field_c = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var5_ref;
            stackOut_60_1 = new StringBuilder().append("ew.L(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param3 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L15;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L15;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (~((ew) this).field_f > ~(((ew) this).field_m + (long)param2)) {
                ((ew) this).field_f = (long)param2 + ((ew) this).field_m;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ew) this).field_l == -1L) {
                break L2;
              } else {
                if (~((ew) this).field_m <= ~((ew) this).field_l) {
                  if (~(((ew) this).field_l - -(long)((ew) this).field_g) <= ~((ew) this).field_m) {
                    break L2;
                  } else {
                    this.e(102);
                    break L2;
                  }
                } else {
                  this.e(102);
                  break L2;
                }
              }
            }
            if (param1 > 37) {
              L3: {
                if (((ew) this).field_l == -1L) {
                  break L3;
                } else {
                  if (~((long)((ew) this).field_k.length + ((ew) this).field_l) > ~(((ew) this).field_m - -(long)param2)) {
                    var5_int = (int)((long)((ew) this).field_k.length - (-((ew) this).field_l + ((ew) this).field_m));
                    dv.a(param3, param0, ((ew) this).field_k, (int)(((ew) this).field_m + -((ew) this).field_l), var5_int);
                    param2 = param2 - var5_int;
                    ((ew) this).field_m = ((ew) this).field_m + (long)var5_int;
                    param0 = param0 + var5_int;
                    ((ew) this).field_g = ((ew) this).field_k.length;
                    this.e(109);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (((ew) this).field_k.length < param2) {
                L4: {
                  if (~((ew) this).field_c != ~((ew) this).field_m) {
                    ((ew) this).field_j.a(15557, ((ew) this).field_m);
                    ((ew) this).field_c = ((ew) this).field_m;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  ((ew) this).field_j.a(1, param3, param0, param2);
                  ((ew) this).field_c = ((ew) this).field_c + (long)param2;
                  if (((ew) this).field_c > ((ew) this).field_i) {
                    ((ew) this).field_i = ((ew) this).field_c;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    var5_long = -1L;
                    var7 = -1L;
                    if (~((ew) this).field_e < ~((ew) this).field_m) {
                      break L7;
                    } else {
                      if ((long)((ew) this).field_b + ((ew) this).field_e > ((ew) this).field_m) {
                        var5_long = ((ew) this).field_m;
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (~((ew) this).field_e > ~((ew) this).field_m) {
                    break L6;
                  } else {
                    if (((ew) this).field_e < (long)param2 + ((ew) this).field_m) {
                      var5_long = ((ew) this).field_e;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L8: {
                  L9: {
                    if (((ew) this).field_m - -(long)param2 <= ((ew) this).field_e) {
                      break L9;
                    } else {
                      if (~(((ew) this).field_m - -(long)param2) < ~(((ew) this).field_e - -(long)((ew) this).field_b)) {
                        break L9;
                      } else {
                        var7 = (long)param2 + ((ew) this).field_m;
                        break L8;
                      }
                    }
                  }
                  if (((ew) this).field_m >= ((ew) this).field_e - -(long)((ew) this).field_b) {
                    break L8;
                  } else {
                    if (((ew) this).field_e + (long)((ew) this).field_b <= ((ew) this).field_m + (long)param2) {
                      var7 = ((ew) this).field_e - -(long)((ew) this).field_b;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L10: {
                  if (var5_long <= -1L) {
                    break L10;
                  } else {
                    if (var7 <= var5_long) {
                      break L10;
                    } else {
                      var9 = (int)(var7 + -var5_long);
                      dv.a(param3, (int)((long)param0 - (-var5_long - -((ew) this).field_m)), ((ew) this).field_h, (int)(-((ew) this).field_e + var5_long), var9);
                      break L10;
                    }
                  }
                }
                ((ew) this).field_m = ((ew) this).field_m + (long)param2;
                return;
              } else {
                if (param2 <= 0) {
                  break L0;
                } else {
                  L11: {
                    if (((ew) this).field_l != -1L) {
                      break L11;
                    } else {
                      ((ew) this).field_l = ((ew) this).field_m;
                      break L11;
                    }
                  }
                  L12: {
                    dv.a(param3, param0, ((ew) this).field_k, (int)(((ew) this).field_m - ((ew) this).field_l), param2);
                    ((ew) this).field_m = ((ew) this).field_m + (long)param2;
                    if ((long)((ew) this).field_g >= ((ew) this).field_m - ((ew) this).field_l) {
                      break L12;
                    } else {
                      ((ew) this).field_g = (int)(-((ew) this).field_l + ((ew) this).field_m);
                      break L12;
                    }
                  }
                  return;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ew) this).field_c = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L13: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var5_ref;
            stackOut_53_1 = new StringBuilder().append("ew.N(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param3 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L13;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L13;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + 41);
        }
    }

    private final void e(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Kickabout.field_G;
          if (param0 > 92) {
            break L0;
          } else {
            ((ew) this).field_f = 70L;
            break L0;
          }
        }
        L1: {
          if (-1L != ((ew) this).field_l) {
            L2: {
              if (((ew) this).field_c == ((ew) this).field_l) {
                break L2;
              } else {
                ((ew) this).field_j.a(15557, ((ew) this).field_l);
                ((ew) this).field_c = ((ew) this).field_l;
                break L2;
              }
            }
            L3: {
              ((ew) this).field_j.a(1, ((ew) this).field_k, 0, ((ew) this).field_g);
              ((ew) this).field_c = ((ew) this).field_c + (long)((ew) this).field_g;
              if (((ew) this).field_i >= ((ew) this).field_c) {
                break L3;
              } else {
                ((ew) this).field_i = ((ew) this).field_c;
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                var4 = -1L;
                if (~((ew) this).field_l > ~((ew) this).field_e) {
                  break L5;
                } else {
                  if (~((ew) this).field_l <= ~(((ew) this).field_e + (long)((ew) this).field_b)) {
                    break L5;
                  } else {
                    var2 = ((ew) this).field_l;
                    break L4;
                  }
                }
              }
              if (((ew) this).field_e < ((ew) this).field_l) {
                break L4;
              } else {
                if (~((long)((ew) this).field_g + ((ew) this).field_l) >= ~((ew) this).field_e) {
                  break L4;
                } else {
                  var2 = ((ew) this).field_e;
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                if (((ew) this).field_l - -(long)((ew) this).field_g <= ((ew) this).field_e) {
                  break L7;
                } else {
                  if ((long)((ew) this).field_b + ((ew) this).field_e >= ((ew) this).field_l + (long)((ew) this).field_g) {
                    var4 = ((ew) this).field_l + (long)((ew) this).field_g;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (~((long)((ew) this).field_b + ((ew) this).field_e) >= ~((ew) this).field_l) {
                break L6;
              } else {
                if (~(((ew) this).field_l - -(long)((ew) this).field_g) > ~((long)((ew) this).field_b + ((ew) this).field_e)) {
                  break L6;
                } else {
                  var4 = (long)((ew) this).field_b + ((ew) this).field_e;
                  break L6;
                }
              }
            }
            L8: {
              if (var2 <= -1L) {
                break L8;
              } else {
                if (~var2 <= ~var4) {
                  break L8;
                } else {
                  var6 = (int)(var4 + -var2);
                  dv.a(((ew) this).field_k, (int)(var2 + -((ew) this).field_l), ((ew) this).field_h, (int)(-((ew) this).field_e + var2), var6);
                  break L8;
                }
              }
            }
            ((ew) this).field_g = 0;
            ((ew) this).field_l = -1L;
            break L1;
          } else {
            break L1;
          }
        }
    }

    ew(ao param0, int param1, int param2) throws IOException {
        ((ew) this).field_e = -1L;
        ((ew) this).field_l = -1L;
        ((ew) this).field_g = 0;
        try {
            ((ew) this).field_j = param0;
            long dupTemp$0 = param0.c(31114);
            ((ew) this).field_i = dupTemp$0;
            ((ew) this).field_f = dupTemp$0;
            ((ew) this).field_k = new byte[param2];
            ((ew) this).field_h = new byte[param1];
            ((ew) this).field_m = 0L;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ew.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "The auction system is currently offline.";
    }
}
