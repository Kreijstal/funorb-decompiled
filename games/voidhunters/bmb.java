/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bmb {
    private gnb field_e;
    static String field_b;
    private asb field_d;
    private asb field_c;
    private gnb field_a;

    private final gd a(byte param0, int param1, int[] param2, int param3) {
        gd discarded$0 = null;
        gd stackIn_5_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_18_0 = null;
        gd stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        gd var8 = null;
        fca var9 = null;
        String var10 = null;
        try {
          L0: {
            L1: {
              var5_int = (param3 << -1778192988 & 65522 | param3 >>> 145642476) ^ param1;
              if (param0 > 52) {
                break L1;
              } else {
                var10 = (String) null;
                discarded$0 = this.a((String) null, (int[]) null, (byte) -7, (String) null);
                break L1;
              }
            }
            var5_int = var5_int | param3 << -282543024;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (gd) ((Object) this.field_a.a(var6, 103));
            if (var8 != null) {
              stackIn_5_0 = (gd) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param2 == null) {
                  break L2;
                } else {
                  if (0 < param2[0]) {
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              L3: {
                var9 = (fca) ((Object) this.field_e.a(var6, 117));
                if (var9 == null) {
                  var9 = fca.a(this.field_c, param3, param1);
                  if (var9 != null) {
                    this.field_e.a(var6, var9, (byte) -122);
                    break L3;
                  } else {
                    stackIn_14_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L3;
                }
              }
              var8 = var9.a(param2);
              if (var8 != null) {
                var9.b(-3846);
                this.field_a.a(var6, var8, (byte) -114);
                stackIn_20_0 = (gd) (var8);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_18_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("bmb.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (gd) ((Object) stackIn_14_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (gd) ((Object) stackIn_18_0);
            } else {
              return stackIn_20_0;
            }
          }
        }
    }

    private final gd a(String param0, int[] param1, byte param2, String param3) {
        gd discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var7 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        gd stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 <= 0) {
                break L1;
              } else {
                var7 = (int[]) null;
                discarded$1 = this.a(-78, (byte) 66, -88, (int[]) null);
                break L1;
              }
            }
            var5_int = this.field_c.b(param0, -75);
            if (var5_int >= 0) {
              var6 = this.field_c.a(true, var5_int, param3);
              if (-1 >= (var6 ^ -1)) {
                stackIn_9_0 = this.a((byte) 123, var6, param1, var5_int);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("bmb.F(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gd) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (gd) ((Object) stackIn_7_0);
          } else {
            return stackIn_9_0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, eab param4, long param5, String param6, boolean param7, int param8, int param9, boolean param10, int param11, int param12, int param13) {
        try {
            int stackIn_3_0 = 0;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                L1: {
                  qga.field_b = new faa(param13);
                  dpa.field_p = new faa(param0);
                  bia.field_d = param1;
                  ff.field_p = param6;
                  cp.field_n = param4;
                  lmb.field_b = param11;
                  if (!param10) {
                    stackIn_3_0 = 0;
                    break L1;
                  } else {
                    stackIn_3_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  js.field_q = stackIn_3_0 != 0;
                  pcb.field_p = param8;
                  rda.field_o = param5;
                  fk.field_c = param9;
                  apa.field_p = param12;
                  beb.field_a = param3;
                  if (param2 >= 46) {
                    break L2;
                  } else {
                    bmb.a((byte) -11);
                    break L2;
                  }
                }
                bua.field_o = param7;
                if (null == cp.field_n.field_o) {
                  break L0;
                } else {
                  try {
                    L3: {
                      vsa.field_r = new gdb(cp.field_n.field_o, 64, 0);
                      break L3;
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
              L4: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_12_0 = (RuntimeException) (var15_ref);

                stackIn_12_1 = new StringBuilder().append("bmb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L4;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param5).append(',');

                if (param6 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final gd a(int param0, byte param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        gd var8 = null;
        ab var9 = null;
        int var10 = 0;
        gd var11 = null;
        gd stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        gd stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = (param0 << -977776188 & 65530 | param0 >>> -162572084) ^ param2;
            var5_int = var5_int | param0 << -1849872400;
            var6 = (long)var5_int;
            var8 = (gd) ((Object) this.field_a.a(var6, 103));
            if (var8 != null) {
              stackIn_3_0 = (gd) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param3 == null) {
                  break L1;
                } else {
                  if (param3[0] > 0) {
                    break L1;
                  } else {
                    stackIn_7_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var9 = ab.a(this.field_d, param0, param2);
              if (var9 != null) {
                L2: {
                  var11 = var9.b();
                  var8 = var11;
                  this.field_a.a(var6, var8, (byte) -113);
                  if (param3 == null) {
                    break L2;
                  } else {
                    param3[0] = param3[0] - var11.field_i.length;
                    break L2;
                  }
                }
                var10 = 3 / ((param1 - 67) / 51);
                stackIn_14_0 = (gd) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("bmb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (gd) ((Object) stackIn_7_0);
          } else {
            return stackIn_14_0;
          }
        }
    }

    final gd a(String param0, String param1, byte param2) {
        RuntimeException var4 = null;
        String var5 = null;
        gd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 > 48) {
                break L1;
              } else {
                var5 = (String) null;
                this.a((String) null, (String) null, (byte) 100);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, (int[]) null, (byte) -56, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("bmb.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final gd a(byte param0, int param1, int[] param2) {
        gd discarded$1 = null;
        RuntimeException var4 = null;
        int[] var5 = null;
        gd stackIn_3_0 = null;
        gd stackIn_7_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_c.c((byte) 95) ^ -1) == -2) {
              stackIn_3_0 = this.a((byte) 101, param1, param2, 0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-2 == (this.field_c.b(param1, param0 + -7069) ^ -1)) {
                stackIn_7_0 = this.a((byte) 112, 0, param2, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 == 127) {
                    break L1;
                  } else {
                    var5 = (int[]) null;
                    discarded$1 = this.a((byte) -33, -89, (int[]) null, -16);
                    break L1;
                  }
                }
                throw new RuntimeException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("bmb.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final gd a(byte param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        gd stackIn_2_0 = null;
        gd stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-2 != (this.field_d.c((byte) 68) ^ -1)) {
              L1: {
                if (param0 == -16) {
                  break L1;
                } else {
                  field_b = (String) null;
                  break L1;
                }
              }
              if ((this.field_d.b(param2, param0 ^ 6930) ^ -1) == -2) {
                stackIn_8_0 = this.a(param2, (byte) -93, 0, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException();
              }
            } else {
              stackIn_2_0 = this.a(0, (byte) -68, param2, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("bmb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    public static void a(byte param0) {
        int var1 = -76 / ((37 - param0) / 55);
        field_b = null;
    }

    bmb(asb param0, asb param1) {
        this.field_e = new gnb(256);
        this.field_a = new gnb(256);
        try {
            this.field_d = param0;
            this.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bmb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Resizable";
    }
}
