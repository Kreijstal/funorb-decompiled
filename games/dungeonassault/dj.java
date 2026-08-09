/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dj {
    static volatile int field_d;
    private ne field_b;
    static int field_a;
    private md field_e;
    static String field_c;

    final ne c(int param0) {
        ne var2;
        ne var3;
        if (param0 == 17756) {
          var2 = this.field_b;
          if (var2 == this.field_e.field_c) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_e;
            return var2;
          }
        } else {
          var3 = (ne) null;
          this.a((ne) null, true);
          var2 = this.field_b;
          if (var2 == this.field_e.field_c) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_e;
            return var2;
          }
        }
    }

    final static void a(int param0, int param1, long param2, int param3, String param4, int param5, int param6, int param7, int param8, boolean param9, int param10, boolean param11, byte param12, qg param13) {
        try {
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            ec var16 = null;
            try {
              L0: {
                L1: {
                  ra.field_c = new wj(param10);
                  ac.field_B = new wj(param1);
                  if (!param9) {
                    stackIn_3_0 = 0;
                    break L1;
                  } else {
                    stackIn_3_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  ld.field_g = stackIn_3_0 != 0;
                  mh.field_g = param8;
                  kn.field_b = param0;
                  if (!param11) {
                    stackIn_6_0 = 0;
                    break L2;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
                L3: {
                  fa.field_j = stackIn_6_0 != 0;
                  an.field_E = param3;
                  dn.field_Q = param2;
                  if (param12 == -27) {
                    break L3;
                  } else {
                    var16 = (ec) null;
                    dj.a((ec) null, (byte) 79);
                    break L3;
                  }
                }
                l.field_b = param7;
                ii.field_D = param4;
                la.field_c = param5;
                sc.field_q = param13;
                rd.field_D = param6;
                if (null == sc.field_q.field_h) {
                  break L0;
                } else {
                  try {
                    L4: {
                      bk.field_b = new hd(sc.field_q.field_h, 64, 0);
                      break L4;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var15 = (IOException) (Object) decompiledCaughtException;
                    throw new RuntimeException(var15.toString());
                  }
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var15_ref);

                stackIn_15_1 = new StringBuilder().append("dj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');

                if (param13 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L6;
                }
              }
              throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0 == 6623) {
              var2_int = 0;
              L1: while (true) {
                if (param1.length() <= var2_int) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var3 = param1.charAt(var2_int);
                    if (uc.a(param0 + -854863799, (char) var3)) {
                      break L2;
                    } else {
                      if (qm.a(57, (char) var3)) {
                        break L2;
                      } else {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("dj.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final ne a(ne param0, boolean param1) {
        ne var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        ne stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_a = 16;
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                var3 = this.field_e.field_c.field_a;
                break L2;
              } else {
                var3 = param0;
                break L2;
              }
            }
            if (var3 == this.field_e.field_c) {
              this.field_b = null;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_b = var3.field_a;
              stackIn_10_0 = (ne) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("dj.H(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ne) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final ne b(int param0) {
        ne var2;
        var2 = this.field_e.field_c.field_a;
        if (var2 != this.field_e.field_c) {
          this.field_b = var2.field_a;
          if (param0 != -1225818257) {
            this.a(-5);
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_b = null;
          return null;
        }
    }

    final ne a(boolean param0, ne param1) {
        ne var3 = null;
        RuntimeException var3_ref = null;
        ne stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        ne stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = this.field_e.field_c.field_e;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (param0) {
              if (var3 == this.field_e.field_c) {
                this.field_b = null;
                stackIn_9_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_b = var3.field_e;
                stackIn_11_0 = (ne) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_5_0 = (ne) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("dj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ne) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    final ne d(int param0) {
        ne var2;
        var2 = this.field_b;
        if (this.field_e.field_c != var2) {
          this.field_b = var2.field_a;
          if (param0 != 1834857157) {
            field_a = 46;
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_b = null;
          return null;
        }
    }

    final ne a(int param0) {
        ne var2;
        var2 = this.field_e.field_c.field_e;
        if (var2 == this.field_e.field_c) {
          this.field_b = null;
          return null;
        } else {
          if (param0 != -479592473) {
            field_c = (String) null;
            this.field_b = var2.field_e;
            return var2;
          } else {
            this.field_b = var2.field_e;
            return var2;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 < 22) {
            qg var2 = (qg) null;
            dj.a(77, 24, 1L, 66, (String) null, -4, 49, 6, -5, true, 116, false, (byte) 34, (qg) null);
        }
    }

    final static String a(byte[] param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              stackIn_4_0 = mk.a((byte) -24, param0, param0.length, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("dj.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    dj(md param0) {
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(ec param0, byte param1) {
        int var2_int = 0;
        try {
            dh.field_g = param0.k(0) << 1834857157;
            if (param1 < 122) {
                dj.a((byte) -97);
            }
            var2_int = param0.c(true);
            dh.field_g = dh.field_g + (var2_int >> -243321085);
            cm.field_P = var2_int << 1851436146 & 1835008;
            cm.field_P = cm.field_P + (param0.k(0) << 12313346);
            var2_int = param0.c(true);
            fm.field_g = 2064384 & var2_int << -1225818257;
            cm.field_P = cm.field_P + (var2_int >> 2020859302);
            fm.field_g = fm.field_g + (param0.c(true) << -479592473);
            var2_int = param0.c(true);
            fm.field_g = fm.field_g + (var2_int >> -1683918239);
            ln.field_e = 65536 & var2_int << -2032974512;
            ln.field_e = ln.field_e + param0.k(0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "dj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = 0;
        field_d = -1;
        field_c = "Defence";
    }
}
