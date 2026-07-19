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
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_19_0 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                if (param0 < 128) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
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
              L4: {
                if (param0 != 0) {
                  var6 = vk.field_e;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var3 >= var6.length) {
                      break L4;
                    } else {
                      var4 = var6[var3];
                      stackOut_13_0 = param0 ^ -1;
                      stackOut_13_1 = var4 ^ -1;
                      stackIn_19_0 = stackOut_13_0;
                      stackIn_19_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        if (stackIn_14_0 != stackIn_14_1) {
                          var3++;
                          if (var5 == 0) {
                            continue L5;
                          } else {
                            break L4;
                          }
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_16_0 = stackOut_15_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackOut_18_0 = -14;
              stackOut_18_1 = (param1 - -14) / 57;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              break L3;
            }
            var2_int = stackIn_19_0 / stackIn_19_1;
            stackOut_19_0 = 0;
            stackIn_20_0 = stackOut_19_0;
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
            return stackIn_16_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            nj var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            dl stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            dl stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            dl stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            String stackIn_14_5 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            dl stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            dl stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            String stackOut_13_5 = null;
            dl stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            String stackOut_12_5 = null;
            var6 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param0 == null) {
                    break L1;
                  } else {
                    var3_ref = kj.a((byte) 105, param0);
                    break L1;
                  }
                }
                L2: {
                  if (param1 != null) {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                we.a(var3_ref, param2 ^ -2);
                var7 = hl.a(var3_ref, "%3a", ":", true);
                var8 = hl.a(var7, "%40", "@", true);
                var9 = hl.a(var8, "%26", "&", true);
                var10 = hl.a(var9, "%23", "#", true);
                if (ik.field_c == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    stackOut_11_0 = lg.field_l;
                    stackOut_11_1 = null;
                    stackOut_11_2 = null;
                    stackOut_11_3 = ik.field_c.getCodeBase();
                    stackOut_11_4 = new StringBuilder().append("clienterror.ws?c=").append(ke.field_J).append("&u=");
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    stackIn_13_4 = stackOut_11_4;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    stackIn_12_4 = stackOut_11_4;
                    if (lb.field_W != null) {
                      stackOut_13_0 = (dl) ((Object) stackIn_13_0);
                      stackOut_13_1 = null;
                      stackOut_13_2 = null;
                      stackOut_13_3 = (java.net.URL) ((Object) stackIn_13_3);
                      stackOut_13_4 = (StringBuilder) ((Object) stackIn_13_4);
                      stackOut_13_5 = lb.field_W;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      stackIn_14_4 = stackOut_13_4;
                      stackIn_14_5 = stackOut_13_5;
                      break L4;
                    } else {
                      stackOut_12_0 = (dl) ((Object) stackIn_12_0);
                      stackOut_12_1 = null;
                      stackOut_12_2 = null;
                      stackOut_12_3 = (java.net.URL) ((Object) stackIn_12_3);
                      stackOut_12_4 = (StringBuilder) ((Object) stackIn_12_4);
                      stackOut_12_5 = "" + d.field_c;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackIn_14_4 = stackOut_12_4;
                      stackIn_14_5 = stackOut_12_5;
                      break L4;
                    }
                  }
                  var4 = ((dl) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + dl.field_a + "&v2=" + dl.field_x + "&e=" + var10), (byte) 68);
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (-1 != (var4.field_c ^ -1)) {
                          break L7;
                        } else {
                          i.a((byte) 27, 1L);
                          if (var6 != 0) {
                            break L6;
                          } else {
                            if (var6 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (var4.field_c != param2) {
                        break L6;
                      } else {
                        var5 = (DataInputStream) (var4.field_e);
                        discarded$1 = var5.read();
                        var5.close();
                        break L6;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var3 = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L8;
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
        RuntimeException var2_ref = null;
        int var3 = 0;
        bl var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (bl) ((Object) m.field_h.a((byte) 51));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    la.a(0, param0, var4);
                    var4 = (bl) ((Object) m.field_h.b(param1 ^ 5819));
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
                if (param1 == -5887) {
                  break L2;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              var2 = kh.field_a.a((byte) 51);
              L4: while (true) {
                if (var2 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  v.a(param1 ^ -5885, param0);
                  var2 = kh.field_a.b(-57);
                  if (var3 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                }
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
