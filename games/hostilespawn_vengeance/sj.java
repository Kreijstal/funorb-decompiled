/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sj {
    static bd field_g;
    static int[] field_f;
    static int[] field_h;
    static String field_d;
    static ub field_c;
    static bd field_b;
    static sg field_a;
    static bd field_e;

    public static void a() {
        field_c = null;
        field_h = null;
        field_f = null;
        field_e = null;
        field_b = null;
        field_g = null;
        field_d = null;
        field_a = null;
    }

    final static int a(boolean param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            vi var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_33_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_32_0 = 0;
            if (ig.field_N.field_k < 4) {
              try {
                L0: {
                  L1: {
                    if (ce.field_e == 0) {
                      db.field_o = jj.field_k.a(fk.field_a, 76, mb.field_p);
                      ce.field_e = ce.field_e + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (ce.field_e == 1) {
                      if (db.field_o.field_f == 2) {
                        stackOut_13_0 = th.a((byte) 125, -1);
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      } else {
                        if (db.field_o.field_f != 1) {
                          break L2;
                        } else {
                          ce.field_e = ce.field_e + 1;
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (ce.field_e != 2) {
                      break L3;
                    } else {
                      be.field_g = new td((java.net.Socket) db.field_o.field_c, jj.field_k);
                      var2 = new vi(13);
                      int discarded$1 = 4122;
                      hm.a(ab.field_c, mm.field_s, var2, nj.field_a);
                      var2.d(87, 15);
                      var2.b(ik.field_a, 25251);
                      be.field_g.a(13, var2.field_n, (byte) -70, 0);
                      ce.field_e = ce.field_e + 1;
                      cb.field_e = hn.a((byte) 80) - -30000L;
                      break L3;
                    }
                  }
                  L4: {
                    if (3 != ce.field_e) {
                      break L4;
                    } else {
                      if (be.field_g.b((byte) 53) <= 0) {
                        if (~hn.a((byte) 80) < ~cb.field_e) {
                          stackOut_28_0 = th.a((byte) 127, -2);
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0;
                        } else {
                          break L4;
                        }
                      } else {
                        var1_int = be.field_g.d((byte) 97);
                        if (var1_int != 0) {
                          stackOut_23_0 = th.a((byte) 122, var1_int);
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          ce.field_e = ce.field_e + 1;
                          break L4;
                        }
                      }
                    }
                  }
                  if (ce.field_e == 4) {
                    ig.field_N.a(kd.field_q, (byte) 75, (Object) (Object) be.field_g);
                    ce.field_e = 0;
                    db.field_o = null;
                    be.field_g = null;
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return th.a((byte) 127, -3);
              }
              return stackIn_33_0;
            } else {
              if (ig.field_N.field_e != -1) {
                if (-2 == ig.field_N.field_e) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b() {
        ji var1 = null;
        RuntimeException var1_ref = null;
        ji var2 = null;
        int var3 = 0;
        int var4 = 0;
        ql stackIn_9_0 = null;
        kd stackIn_10_0 = null;
        kd stackIn_11_0 = null;
        kd stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ql stackOut_8_0 = null;
        ql stackOut_7_0 = null;
        kd stackOut_9_0 = null;
        kd stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        kd stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = cl.field_o;
              var2 = bb.field_e;
              if (bm.field_c == 1) {
                var2 = ua.field_f;
                var1 = en.field_u;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!ii.b((byte) 30)) {
                break L2;
              } else {
                var1 = bb.field_b;
                break L2;
              }
            }
            L3: {
              ha.field_w.field_F.a(true, (byte) 123, var1);
              ha.field_w.field_C.a(true, (byte) 123, uk.field_d);
              ha.field_w.field_B = var2;
              ha.field_w.field_n.a(true, (byte) 12, var2);
              if (null == q.field_g) {
                stackOut_8_0 = ue.field_a;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = q.field_g;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            L4: {
              ni.field_e = ((ql) (Object) stackIn_9_0).a(mm.field_m[0].field_j, false, (byte) 109);
              stackOut_9_0 = ha.field_w;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (!ni.field_e) {
                stackOut_11_0 = (kd) (Object) stackIn_11_0;
                stackOut_11_1 = 1048576;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L4;
              } else {
                stackOut_10_0 = (kd) (Object) stackIn_10_0;
                stackOut_10_1 = -1048576;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L4;
              }
            }
            stackIn_12_0.field_w = stackIn_12_1;
            ha.field_w.field_r = 128;
            ha.field_w.field_l = true;
            mb.field_s.a(256);
            var3 = 0;
            L5: while (true) {
              if (var3 >= 16) {
                break L0;
              } else {
                mb.field_s.field_n.a(0, var3, (byte) -95);
                var3++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1_ref, "sj.D(" + 1 + 41);
        }
    }

    final static void a(int[] param0, oj param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_I <= 0) {
                break L1;
              } else {
                if (ln.field_a.field_y[param3] != 82) {
                  break L1;
                } else {
                  param0[param3 + -param2] = 2;
                  param0[param3] = 2;
                  param0[param3 + param2] = 2;
                  return;
                }
              }
            }
            L2: {
              if (param0[param3 - param2] != 2) {
                break L2;
              } else {
                param0[param3 + -param2] = 0;
                break L2;
              }
            }
            L3: {
              if (2 == param0[param3]) {
                param0[param3] = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0[param2 + param3] != 2) {
                break L4;
              } else {
                param0[param2 + param3] = 0;
                break L4;
              }
            }
            ln.field_a.field_y[-param2 + param3] = 144;
            ln.field_a.field_y[param3] = 152;
            ln.field_a.field_y[param2 + param3] = 145;
            param1.field_i = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("sj.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 44 + param3 + 44 + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[8192];
        field_d = "There are unusual life signs on the ship, so be careful in your search. Proceed towards your objective.";
        field_h = new int[]{370, 370, 410};
        field_c = new ub();
    }
}
