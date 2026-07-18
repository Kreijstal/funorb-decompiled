/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ll {
    static String field_a;

    final static boolean a(ce param0, int param1, ce param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var5 = null;
                boolean discarded$2 = ll.a((ce) null, -78, (ce) null);
                break L1;
              }
            }
            L2: {
              var3_int = -param2.field_db + param0.field_db;
              if (nh.field_z != param0.field_cb) {
                if (null == param0.field_cb) {
                  var3_int += 200;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var3_int -= 200;
                break L2;
              }
            }
            L3: {
              if (nh.field_z == param2.field_cb) {
                var3_int += 200;
                break L3;
              } else {
                if (null != param2.field_cb) {
                  break L3;
                } else {
                  var3_int -= 200;
                  break L3;
                }
              }
            }
            L4: {
              if (var3_int <= 0) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("ll.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final static void a(int param0, boolean param1, boolean param2) {
        try {
            RuntimeException var3 = null;
            f[][] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            kb var10 = null;
            RuntimeException decompiledCaughtException = null;
            var9 = CrazyCrystals.field_B;
            try {
              L0: {
                df.field_c = wd.field_j;
                no.field_k = ob.field_l;
                if (param0 < -80) {
                  L1: {
                    bh.field_c = fn.field_j;
                    vk.field_I = mb.field_g;
                    if (param2) {
                      li.field_a = null;
                      break L1;
                    } else {
                      if (null == li.field_a) {
                        break L1;
                      } else {
                        if (li.field_a.field_l != null) {
                          break L1;
                        } else {
                          li.field_a = null;
                          break L1;
                        }
                      }
                    }
                  }
                  var10 = (kb) rc.field_a.elementAt(uo.field_o);
                  qg.field_q = 0;
                  va.field_d = 0;
                  jm.field_b = 0;
                  var4 = var10.field_b;
                  oe.field_a = new fq[3];
                  ol.field_B = 0;
                  rl.field_h = 0;
                  qh.field_o = new Vector();
                  tm.field_e = 0;
                  km.field_d = 0;
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= 3) {
                      L3: {
                        L4: {
                          var5 = -3 + var4[0].length;
                          var6 = -3 + var4.length;
                          var7 = (var6 - 2) / 2 + 4;
                          w.field_f = var7;
                          var8 = 4 + (var5 + -2) / 2;
                          ia.field_i = var8;
                          pm.field_d = 0;
                          to.field_c = 0;
                          gl.field_e = 0;
                          gm.field_c = new int[2];
                          tm.field_d = md.a(var8, false, var7, -93, var4);
                          no.a(var8, -8383, var7, tm.field_d);
                          if (null == rn.field_q) {
                            break L4;
                          } else {
                            if (!rn.field_q.equals((Object) (Object) hf.field_b[var10.field_d])) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        um.a(kk.field_j[var10.field_d], hf.field_b[var10.field_d], (byte) 80);
                        break L3;
                      }
                      L5: {
                        en.field_O = 0;
                        kd.field_l = nj.a(45, var8, var7);
                        if (!param1) {
                          cn.field_d = null;
                          td.field_c = null;
                          bq.field_i = ce.b((byte) -126);
                          if (bq.field_i != null) {
                            break L5;
                          } else {
                            bq.field_i = kd.field_l;
                            break L5;
                          }
                        } else {
                          cn.field_d = kd.field_l;
                          bq.field_i = kd.field_l;
                          td.field_c = ce.b((byte) -125);
                          if (null != td.field_c) {
                            ca.field_j = -60;
                            mi.i(22075);
                            break L5;
                          } else {
                            td.field_c = bq.field_i;
                            ca.field_j = -60;
                            mi.i(22075);
                            break L5;
                          }
                        }
                      }
                      md.field_k[2] = 0;
                      md.field_k[1] = 0;
                      qp.field_f = false;
                      mo.field_f = 0;
                      va.field_c = 0;
                      md.field_k[0] = 32;
                      break L0;
                    } else {
                      q.field_a[var5].a((byte) 118);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
              throw dn.a((Throwable) (Object) var3, "ll.A(" + param0 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Press F12 for access to all levels";
    }
}
