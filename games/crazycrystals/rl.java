/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rl extends oh {
    static String field_f;
    static db field_i;
    static String field_g;
    static int field_h;

    rl() {
    }

    final static void d(int param0) {
        RuntimeException runtimeException = null;
        md var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = CrazyCrystals.field_B;
        try {
          L0: {
            var1 = tp.field_f;
            L1: while (true) {
              L2: {
                L3: {
                  if (!cn.b(114)) {
                    break L3;
                  } else {
                    var1.d(param0 ^ 8, 8);
                    int fieldTemp$2 = var1.field_f + 1;
                    var1.field_f = var1.field_f + 1;
                    var2 = fieldTemp$2;
                    ke.a(var1, -9129);
                    tp.field_f.c((byte) 47, var1.field_f - var2);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 0) {
                  break L2;
                } else {
                  field_g = null;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dn.a((Throwable) (Object) runtimeException, "rl.K(" + param0 + ')');
        }
    }

    final int a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -53) {
                break L1;
              } else {
                int discarded$2 = ((rl) this).a((byte) 90, false);
                break L1;
              }
            }
            L2: {
              if (!param1) {
                stackOut_6_0 = 4;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 16;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var3, "rl.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    public static void e(int param0) {
        try {
            field_f = null;
            field_g = null;
            field_i = null;
            int var1_int = -1 % ((57 - param0) / 63);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "rl.E(" + param0 + ')');
        }
    }

    final static nd c(int param0) {
        RuntimeException var1 = null;
        Object stackIn_5_0 = null;
        nd stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (null != p.field_i) {
                break L1;
              } else {
                p.field_i = new nd();
                p.field_i.a(ai.field_h, false);
                p.field_i.field_l = 6;
                p.field_i.field_g = 5;
                p.field_i.field_c = 7697781;
                p.field_i.field_j = 4;
                p.field_i.field_f = 14;
                p.field_i.field_d = 0;
                p.field_i.field_h = 2763306;
                p.field_i.field_m = ba.field_i;
                break L1;
              }
            }
            if (param0 == -9918) {
              stackOut_6_0 = p.field_i;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (nd) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "rl.J(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final static int c(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 58) {
                break L1;
              } else {
                rl.e(-15);
                break L1;
              }
            }
            stackOut_3_0 = gp.field_a;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "rl.D(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 1843275042) {
                break L1;
              } else {
                int discarded$2 = rl.b(117, (byte) -122);
                break L1;
              }
            }
            stackOut_3_0 = q.field_a[ma.field_n[param1]].field_e[0];
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var3, "rl.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              pc.field_y = 0;
              lo.field_b = null;
              rc.field_a = ol.field_z[param1];
              jo.field_o = param1;
              if (param1 == 0) {
                vh.field_a = true;
                break L1;
              } else {
                break L1;
              }
            }
            uo.field_o = param2;
            dk.field_h = param2;
            mb.field_g = 25;
            ob.field_l = 10;
            wd.field_j = 60;
            fn.field_j = 8;
            if (param0 == 26) {
              je.field_j = qk.field_F;
              we.field_h = sm.field_f;
              b.field_a = ka.field_n;
              fp.field_a = ei.field_F;
              var3_int = param2;
              mb.field_g = mb.field_g + var3_int;
              sa.n(-26);
              a.field_b = null;
              qn.field_n = 0;
              gh.field_C = 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dn.a((Throwable) (Object) runtimeException, "rl.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int b(int param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            param0 = param0 & 8191;
            if (param1 == -23) {
              if (param0 >= 4096) {
                L1: {
                  if (param0 < 6144) {
                    stackOut_14_0 = -fe.field_h[param0 - 4096];
                    stackIn_15_0 = stackOut_14_0;
                    break L1;
                  } else {
                    stackOut_12_0 = -fe.field_h[-param0 + 8192];
                    stackIn_15_0 = stackOut_12_0;
                    break L1;
                  }
                }
                break L0;
              } else {
                L2: {
                  if (param0 < 2048) {
                    stackOut_9_0 = fe.field_h[param0];
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    stackOut_7_0 = fe.field_h[-param0 + 4096];
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
                return stackIn_10_0;
              }
            } else {
              stackOut_1_0 = 95;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "rl.R(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Email is valid";
        field_g = "This is a rock.<br><br>You can push rocks.<br><br>Rocks fall if they are<br>unsupported. They also<br>roll off curved edges<br>and round objects.<br><br>Occasionally, you may need to push a rock while it is falling. Move out of the way to let it fall, and then push it. You must be quick!";
    }
}
