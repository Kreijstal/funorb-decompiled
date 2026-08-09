/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ic extends am {
    String[][] field_p;
    long[][] field_i;
    static String field_o;
    int field_q;
    int field_h;
    static bd field_k;
    boolean field_m;
    int[][] field_l;
    static int field_n;
    int field_j;

    final static void a(int param0, int param1, p param2, byte param3) {
        try {
            pe.field_fb[4].a(true, 128, (int)param2.field_c, param0 - -8, 8 + param1);
            if (param3 != 107) {
                field_n = -58;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ic.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, String param1, Throwable param2) {
        try {
            fd stackIn_12_0;
            int stackIn_12_1;
            java.net.URL stackIn_12_2;
            java.net.URL stackIn_12_3;
            java.net.URL stackIn_12_4;
            StringBuilder stackIn_12_5;
            fd stackIn_13_0;
            int stackIn_13_1;
            java.net.URL stackIn_13_2;
            java.net.URL stackIn_13_3;
            java.net.URL stackIn_13_4;
            StringBuilder stackIn_13_5;
            String stackIn_13_6;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            kk var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            var6 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param2 != null) {
                    var3 = od.a((byte) -77, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param2 == null) {
                        break L3;
                      } else {
                        var3 = var3 + " | ";
                        break L3;
                      }
                    }
                    var3 = var3 + param1;
                    break L2;
                  }
                }
                jf.a(var3, (byte) 19);
                var7 = re.a(var3, ":", "%3a", -125);
                var8 = re.a(var7, "@", "%40", -124);
                var9 = re.a(var8, "&", "%26", -113);
                var10 = re.a(var9, "#", "%23", -113);
                if (HostileSpawn.field_B != null) {
                  L4: {
                    stackIn_12_0 = lj.field_t;

                    stackIn_12_1 = 30085;

                    stackIn_12_2 = null;

                    stackIn_12_3 = null;

                    stackIn_12_4 = HostileSpawn.field_B.getCodeBase();

                    stackIn_12_5 = new StringBuilder().append("clienterror.ws?c=").append(ql.field_a).append("&u=");

                    if (kj.field_e != null) {
                      stackIn_13_0 = (fd) ((Object) stackIn_12_0);
                      stackIn_13_1 = stackIn_12_1;
                      stackIn_13_2 = null;
                      stackIn_13_3 = null;
                      stackIn_13_4 = (java.net.URL) ((Object) stackIn_12_4);
                      stackIn_13_5 = (StringBuilder) ((Object) stackIn_12_5);
                      stackIn_13_6 = kj.field_e;
                      break L4;
                    } else {
                      stackIn_13_0 = (fd) ((Object) stackIn_12_0);
                      stackIn_13_1 = stackIn_12_1;
                      stackIn_13_2 = null;
                      stackIn_13_3 = null;
                      stackIn_13_4 = (java.net.URL) ((Object) stackIn_12_4);
                      stackIn_13_5 = (StringBuilder) ((Object) stackIn_12_5);
                      stackIn_13_6 = "" + wg.field_yb;
                      break L4;
                    }
                  }
                  var4 = ((fd) (Object) stackIn_13_0).a(stackIn_13_1, new java.net.URL(stackIn_13_4, stackIn_13_6 + "&v1=" + fd.field_u + "&v2=" + fd.field_h + "&e=" + var10));
                  L5: while (true) {
                    if (-1 != (var4.field_f ^ -1)) {
                      if (param0 < -114) {
                        L6: {
                          if (1 != var4.field_f) {
                            break L6;
                          } else {
                            var5 = (DataInputStream) (var4.field_c);
                            var5.read();
                            var5.close();
                            break L6;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      vj.a(1L, (byte) -49);
                      continue L5;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 2;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ll b(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        ll var7 = null;
        int var8 = 0;
        ll stackIn_4_0 = null;
        ll stackIn_7_0 = null;
        ll stackIn_10_0 = null;
        ll stackIn_18_0 = null;
        ll stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackIn_4_0 = gf.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-256 <= (var2_int ^ -1)) {
                var3 = cj.a(param0, -57, '.');
                if (var3.length >= 2) {
                  L1: {
                    var4 = var3;
                    if (param1 == -36) {
                      break L1;
                    } else {
                      ic.c(29);
                      break L1;
                    }
                  }
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4.length) {
                      stackIn_21_0 = gn.a(var3[-1 + var3.length], false);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = cb.a(var6, 99);
                      if (var7 != null) {
                        stackIn_18_0 = (ll) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  stackIn_10_0 = gf.field_f;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = hb.field_v;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("ic.A(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return stackIn_21_0;
              }
            }
          }
        }
    }

    public static void c(int param0) {
        if (param0 != 128) {
            p var2 = (p) null;
            ic.a(43, 18, (p) null, (byte) -98);
        }
        field_o = null;
        field_k = null;
    }

    ic() {
    }

    static {
        field_o = "Email (Login):";
    }
}
