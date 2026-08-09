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

    public static void a(byte param0) {
        if (param0 != 58) {
          field_h = (int[]) null;
          field_c = null;
          field_h = null;
          field_f = null;
          field_e = null;
          field_b = null;
          field_g = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_h = null;
          field_f = null;
          field_e = null;
          field_b = null;
          field_g = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final static int a(boolean param0) {
        try {
            int stackIn_17_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_36_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            vi var2 = null;
            if (ig.field_N.field_k < 4) {
              L0: {
                if (param0) {
                  break L0;
                } else {
                  field_b = (bd) null;
                  break L0;
                }
              }
              try {
                L1: {
                  L2: {
                    if (ce.field_e == 0) {
                      db.field_o = jj.field_k.a(fk.field_a, 76, mb.field_p);
                      ce.field_e = ce.field_e + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if ((ce.field_e ^ -1) == -2) {
                      if ((db.field_o.field_f ^ -1) == -3) {
                        stackIn_17_0 = th.a((byte) 125, -1);
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        if (-2 != (db.field_o.field_f ^ -1)) {
                          break L3;
                        } else {
                          ce.field_e = ce.field_e + 1;
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((ce.field_e ^ -1) != -3) {
                      break L4;
                    } else {
                      be.field_g = new td((java.net.Socket) (db.field_o.field_c), jj.field_k);
                      var2 = new vi(13);
                      hm.a(ab.field_c, mm.field_s, var2, nj.field_a, 4122);
                      var2.d(87, 15);
                      var2.b(ik.field_a, 25251);
                      be.field_g.a(13, var2.field_n, (byte) -70, 0);
                      ce.field_e = ce.field_e + 1;
                      cb.field_e = hn.a((byte) 80) - -30000L;
                      break L4;
                    }
                  }
                  L5: {
                    if (3 != ce.field_e) {
                      break L5;
                    } else {
                      if (-1 <= (be.field_g.b((byte) 53) ^ -1)) {
                        if ((hn.a((byte) 80) ^ -1L) < (cb.field_e ^ -1L)) {
                          stackIn_32_0 = th.a((byte) 127, -2);
                          decompiledRegionSelector0 = 2;
                          break L1;
                        } else {
                          break L5;
                        }
                      } else {
                        var1_int = be.field_g.d((byte) 97);
                        if (var1_int != 0) {
                          stackIn_27_0 = th.a((byte) 122, var1_int);
                          decompiledRegionSelector0 = 1;
                          break L1;
                        } else {
                          ce.field_e = ce.field_e + 1;
                          break L5;
                        }
                      }
                    }
                  }
                  if ((ce.field_e ^ -1) == -5) {
                    ig.field_N.a(kd.field_q, (byte) 75, be.field_g);
                    ce.field_e = 0;
                    db.field_o = null;
                    be.field_g = null;
                    stackIn_36_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L1;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return th.a((byte) 127, -3);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_27_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_32_0;
                  } else {
                    return stackIn_36_0;
                  }
                }
              }
            } else {
              if (0 != (ig.field_N.field_e ^ -1)) {
                if (-2 != ig.field_N.field_e) {
                  return 1;
                } else {
                  return 4;
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

    final static void b(boolean param0) {
        ji var1 = null;
        ji var2 = null;
        int var3 = 0;
        int var4 = 0;
        ql stackIn_9_0 = null;
        kd stackIn_11_0 = null;
        kd stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = cl.field_o;
              var2 = bb.field_e;
              if ((bm.field_c ^ -1) == -2) {
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
              ha.field_w.field_F.a(param0, (byte) 123, var1);
              ha.field_w.field_C.a(true, (byte) 123, uk.field_d);
              ha.field_w.field_B = var2;
              ha.field_w.field_n.a(true, (byte) 12, var2);
              if (null == q.field_g) {
                stackIn_9_0 = ue.field_a;
                break L3;
              } else {
                stackIn_9_0 = q.field_g;
                break L3;
              }
            }
            L4: {
              ni.field_e = ((ql) (Object) stackIn_9_0).a(mm.field_m[0].field_j, false, (byte) 109);
              stackIn_11_0 = ha.field_w;

              if (!ni.field_e) {
                stackIn_12_0 = (kd) ((Object) stackIn_11_0);
                stackIn_12_1 = 1048576;
                break L4;
              } else {
                stackIn_12_0 = (kd) ((Object) stackIn_11_0);
                stackIn_12_1 = -1048576;
                break L4;
              }
            }
            stackIn_12_0.field_w = stackIn_12_1;
            ha.field_w.field_r = 128;
            ha.field_w.field_l = true;
            mb.field_s.a(256);
            var3 = 0;
            L5: while (true) {
              if (-17 >= (var3 ^ -1)) {
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
          throw wg.a((Throwable) ((Object) var1_ref), "sj.D(" + param0 + ')');
        }
    }

    final static void a(int[] param0, oj param1, int param2, int param3, int param4) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param4 == 0) {
                break L1;
              } else {
                sj.b(true);
                break L1;
              }
            }
            L2: {
              if (-1 <= (param1.field_I ^ -1)) {
                break L2;
              } else {
                if (ln.field_a.field_y[param3] != 82) {
                  break L2;
                } else {
                  param0[param3 + -param2] = 2;
                  param0[param3] = 2;
                  param0[param3 + param2] = 2;
                  return;
                }
              }
            }
            L3: {
              if (param0[param3 - param2] != 2) {
                break L3;
              } else {
                param0[param3 + -param2] = 0;
                break L3;
              }
            }
            L4: {
              if (2 == param0[param3]) {
                param0[param3] = 0;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0[param2 + param3] != 2) {
                break L5;
              } else {
                param0[param2 + param3] = 0;
                break L5;
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
          L6: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("sj.C(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_f = new int[8192];
        field_d = "There are unusual life signs on the ship, so be careful in your search. Proceed towards your objective.";
        field_h = new int[]{370, 370, 410};
        field_c = new ub();
    }
}
