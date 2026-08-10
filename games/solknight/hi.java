/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hi {
    private o[] field_a;

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                if (param0 < 128) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 < 160) {
                break L2;
              } else {
                if (param0 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (param0 != 0) {
                var6 = vk.field_e;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var3 >= var6.length) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if ((param0 ^ -1) != (var4 ^ -1)) {
                      var3++;
                      continue L4;
                    } else {
                      stackIn_15_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            var2_int = -14 / ((param1 - -14) / 57);
            stackIn_18_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2_ref), "hi.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
            dl stackIn_13_0;
            java.net.URL stackIn_13_1;
            java.net.URL stackIn_13_2;
            java.net.URL stackIn_13_3;
            StringBuilder stackIn_13_4;
            dl stackIn_14_0;
            java.net.URL stackIn_14_1;
            java.net.URL stackIn_14_2;
            java.net.URL stackIn_14_3;
            StringBuilder stackIn_14_4;
            String stackIn_14_5;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            nj var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            var6 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param0 == null) {
                    break L1;
                  } else {
                    var3 = kj.a((byte) 105, param0);
                    break L1;
                  }
                }
                L2: {
                  if (param1 != null) {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3 = var3 + " | ";
                        break L3;
                      }
                    }
                    var3 = var3 + param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                we.a(var3, param2 ^ -2);
                var7 = hl.a(var3, "%3a", ":", true);
                var8 = hl.a(var7, "%40", "@", true);
                var9 = hl.a(var8, "%26", "&", true);
                var10 = hl.a(var9, "%23", "#", true);
                if (ik.field_c == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    stackIn_13_0 = lg.field_l;

                    stackIn_13_1 = null;

                    stackIn_13_2 = null;

                    stackIn_13_3 = ik.field_c.getCodeBase();

                    stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(ke.field_J).append("&u=");

                    if (lb.field_W != null) {
                      stackIn_14_0 = (dl) ((Object) stackIn_13_0);
                      stackIn_14_1 = null;
                      stackIn_14_2 = null;
                      stackIn_14_3 = (java.net.URL) ((Object) stackIn_13_3);
                      stackIn_14_4 = (StringBuilder) ((Object) stackIn_13_4);
                      stackIn_14_5 = lb.field_W;
                      break L4;
                    } else {
                      stackIn_14_0 = (dl) ((Object) stackIn_13_0);
                      stackIn_14_1 = null;
                      stackIn_14_2 = null;
                      stackIn_14_3 = (java.net.URL) ((Object) stackIn_13_3);
                      stackIn_14_4 = (StringBuilder) ((Object) stackIn_13_4);
                      stackIn_14_5 = "" + d.field_c;
                      break L4;
                    }
                  }
                  var4 = ((dl) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + dl.field_a + "&v2=" + dl.field_x + "&e=" + var10), (byte) 68);
                  L5: while (true) {
                    if (-1 != (var4.field_c ^ -1)) {
                      L6: {
                        if (var4.field_c != param2) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) (var4.field_e);
                          var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      i.a((byte) 27, 1L);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        gg var2 = null;
        int var3 = 0;
        bl var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (bl) ((Object) m.field_h.a((byte) 51));
            L1: while (true) {
              if (var4 == null) {
                if (param1 == -5887) {
                  var2 = kh.field_a.a((byte) 51);
                  L2: while (true) {
                    if (var2 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      v.a(param1 ^ -5885, param0);
                      var2 = kh.field_a.b(-57);
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                la.a(0, param0, var4);
                var4 = (bl) ((Object) m.field_h.b(param1 ^ 5819));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2_ref), "hi.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
            return;
        }
        uj.a(param1, param3, param4, this.field_a, param2, 2);
    }

    hi(o[] param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
