/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pf {
    private long field_b;
    static he[] field_c;
    static long field_a;
    static int field_f;
    private long field_d;
    private RandomAccessFile field_e;

    final void c(int param0) throws IOException {
        if (null != this.field_e) {
            this.field_e.close();
            this.field_e = null;
        }
        int var2 = 18 / ((40 - param0) / 47);
    }

    protected final void finalize() throws Throwable {
        if (!(this.field_e == null)) {
            System.out.println("");
            this.c(90);
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != 1536) {
            pf.b(127);
        }
        this.field_e.seek(param1);
        this.field_d = param1;
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param0 == 1) {
                  break L1;
                } else {
                  field_f = 72;
                  break L1;
                }
              }
              var3_int = param2.length();
              if (-2 < (var3_int ^ -1)) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-13 <= (var3_int ^ -1)) {
                  L2: {
                    var4 = rh.a(-72, param2);
                    if (var4 == null) {
                      break L2;
                    } else {
                      if (1 > var4.length()) {
                        break L2;
                      } else {
                        L3: {
                          if (je.a(var4.charAt(0), 89)) {
                            break L3;
                          } else {
                            if (je.a(var4.charAt(var4.length() - 1), 117)) {
                              break L3;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L4: while (true) {
                                if (var6 >= param2.length()) {
                                  if (-1 <= (var5 ^ -1)) {
                                    stackIn_35_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    stackIn_33_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                } else {
                                  L5: {
                                    var7 = param2.charAt(var6);
                                    if (je.a((char) var7, 107)) {
                                      var5++;
                                      break L5;
                                    } else {
                                      var5 = 0;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (2 > var5) {
                                      break L6;
                                    } else {
                                      if (param1) {
                                        break L6;
                                      } else {
                                        stackIn_29_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                        stackIn_20_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                  stackIn_15_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
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
          L7: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("pf.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L7;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L7;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_29_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_33_0 != 0;
                  } else {
                    return stackIn_35_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_e.read(param0, param3, param1);
              if ((var5_int ^ -1) < param2) {
                this.field_d = this.field_d + (long)var5_int;
                break L1;
              } else {
                break L1;
              }
            }
            stackIn_4_0 = var5_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("pf.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 > -73) {
            pf.a((byte) 42);
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        if ((this.field_d + (long)param1 ^ -1L) < (this.field_b ^ -1L)) {
            this.field_e.seek(this.field_b);
            this.field_e.write(1);
            throw new EOFException();
        }
        if (param0 > -82) {
            return;
        }
        try {
            this.field_e.write(param3, param2, param1);
            this.field_d = this.field_d + (long)param1;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "pf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    pf(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if ((param0.length() ^ -1L) < (param2 ^ -1L)) {
                param0.delete();
            }
            this.field_e = new RandomAccessFile(param0, param1);
            this.field_b = param2;
            this.field_d = 0L;
            var5_int = this.field_e.read();
            if (-1 != var5_int && !param1.equals("r")) {
                this.field_e.seek(0L);
                this.field_e.write(var5_int);
            }
            this.field_e.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "pf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 97) {
            field_c = (he[]) null;
        }
        return sh.field_e;
    }

    final long a(int param0) throws IOException {
        if (param0 >= -38) {
            return -62L;
        }
        return this.field_e.length();
    }

    static {
    }
}
