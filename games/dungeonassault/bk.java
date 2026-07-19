/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk implements Runnable {
    volatile vn[] field_g;
    static hd field_b;
    static String[] field_f;
    static String field_c;
    static ph field_e;
    qg field_h;
    volatile boolean field_d;
    volatile boolean field_a;

    public static void a(boolean param0) {
        String discarded$0 = null;
        if (param0) {
            discarded$0 = bk.b(89);
        }
        field_c = null;
        field_b = null;
        field_e = null;
        field_f = null;
    }

    final static String b(int param0) {
        if (param0 != 1) {
            field_e = (ph) null;
        }
        if (ti.field_f) {
            return null;
        }
        if (no.field_a < lp.field_z) {
            return null;
        }
        if (!(lp.field_z - -ga.field_p <= no.field_a)) {
            return vj.field_c;
        }
        return null;
    }

    final static int a(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            ec var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_36_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_33_0 = 0;
            if (4 > hb.field_a.field_h) {
              try {
                L0: {
                  L1: {
                    if (ba.field_f == 0) {
                      qi.field_e = kn.field_f.a(param0 ^ -119, lk.field_T, of.field_d);
                      ba.field_f = ba.field_f + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if ((ba.field_f ^ -1) == -2) {
                      if (qi.field_e.field_c != 2) {
                        if (qi.field_e.field_c == 1) {
                          ba.field_f = ba.field_f + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        stackOut_13_0 = dl.a(-5, -1);
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if ((ba.field_f ^ -1) != -3) {
                      break L3;
                    } else {
                      pe.field_l = new rk((java.net.Socket) (qi.field_e.field_f), kn.field_f);
                      var2 = new ec(13);
                      rg.a(ri.field_b, var2, pj.field_a, param0 + 127, j.field_J);
                      var2.a(6, 15);
                      var2.a((byte) 63, ng.field_I);
                      pe.field_l.b(var2.field_m, false, 0, 13);
                      ba.field_f = ba.field_f + 1;
                      ce.field_s = kd.c(param0 + -2456) - -30000L;
                      break L3;
                    }
                  }
                  L4: {
                    if (ba.field_f != 3) {
                      break L4;
                    } else {
                      if (0 >= pe.field_l.a(0)) {
                        if ((kd.c(-2456) ^ -1L) < (ce.field_s ^ -1L)) {
                          stackOut_28_0 = dl.a(param0 + -5, -2);
                          stackIn_29_0 = stackOut_28_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L4;
                        }
                      } else {
                        var1_int = pe.field_l.a((byte) -108);
                        if (0 == var1_int) {
                          ba.field_f = ba.field_f + 1;
                          break L4;
                        } else {
                          stackOut_23_0 = dl.a(-5, var1_int);
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L5: {
                    if (param0 == 0) {
                      break L5;
                    } else {
                      field_f = (String[]) null;
                      break L5;
                    }
                  }
                  if ((ba.field_f ^ -1) != -5) {
                    stackOut_35_0 = -1;
                    stackIn_36_0 = stackOut_35_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    hb.field_a.a(pe.field_l, kn.field_c, (byte) 118);
                    pe.field_l = null;
                    ba.field_f = 0;
                    qi.field_e = null;
                    stackOut_33_0 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return dl.a(-5, -3);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_24_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_29_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_34_0;
                    } else {
                      return stackIn_36_0;
                    }
                  }
                }
              }
            } else {
              if (0 == (hb.field_a.field_c ^ -1)) {
                return 3;
              } else {
                if (hb.field_a.field_c == -2) {
                  return 4;
                } else {
                  return 1;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = DungeonAssault.field_K;
          var2 = 0;
          var3 = nl.field_d;
          if ((var3 ^ -1) > -6) {
            var2 = 8192 * (var3 * var3) / 1100;
            break L0;
          } else {
            if (-106 < (var3 ^ -1)) {
              var2 = (-40960 + var3 * 16384) / 220;
              break L0;
            } else {
              if (var3 >= 120) {
                break L0;
              } else {
                var3 = -var3 + 120;
                var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
                break L0;
              }
            }
          }
        }
        L1: {
          var4 = 1;
          var5 = 0;
          if (param1 != 1) {
            break L1;
          } else {
            var5 = 1;
            break L1;
          }
        }
        L2: {
          if ((param1 ^ -1) != -4) {
            break L2;
          } else {
            var4 = -1;
            break L2;
          }
        }
        L3: {
          if (-5 != (param1 ^ -1)) {
            break L3;
          } else {
            var4 = 1;
            var5 = 1;
            break L3;
          }
        }
        L4: {
          if (5 == param1) {
            var4 = -1;
            var5 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if ((param1 ^ -1) != -7) {
            break L5;
          } else {
            var4 = 1;
            var5 = -1;
            break L5;
          }
        }
        L6: {
          L7: {
            if (param1 == param0) {
              break L7;
            } else {
              if ((param1 ^ -1) == -9) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L6;
        }
        L8: {
          if (param1 == 11) {
            var4 = -1;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (12 == param1) {
            var5 = -1;
            var4 = -1;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if (param1 == 13) {
            var5 = -1;
            var4 = 1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (-15 == (param1 ^ -1)) {
            var4 = -1;
            var5 = 1;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (param1 != 15) {
            break L12;
          } else {
            var5 = 1;
            var4 = 1;
            break L12;
          }
        }
        pj.field_e = vf.a(var5 * var2, var2 * var4, (byte) 84);
    }

    public final void run() {
        int var1_int = 0;
        vn var2 = null;
        int var4 = DungeonAssault.field_K;
        this.field_d = true;
        try {
            while (!this.field_a) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = this.field_g[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.a();
                    }
                }
                pj.a(0, 10L);
                Object var5 = (Object) null;
                ho.a(this.field_h, (Object) null, (byte) -32);
            }
        } catch (Exception exception) {
            String var6 = (String) null;
            sm.a((Throwable) ((Object) exception), 1, (String) null);
        } finally {
            this.field_d = false;
        }
    }

    final static void a(qk param0, byte param1, int param2, int param3, int param4, qk param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              ci.field_j = param4;
              oh.field_t = param3;
              om.field_d = param5;
              gd.field_G = param0;
              h.field_q = param2;
              if (param1 == -40) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("bk.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    bk() {
        this.field_g = new vn[2];
        this.field_a = false;
        this.field_d = false;
    }

    static {
        field_c = "Type your email address again to make sure it's correct";
        field_f = new String[]{null, "<%guardians> require a raider either to <%dodge> (testing against the room's <%snare>), or, more commonly, <%sneak> (against the room's <%detect>)"};
    }
}
