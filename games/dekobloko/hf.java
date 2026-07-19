/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf {
    static String field_b;
    static String field_c;
    static String field_g;
    static ck[][] field_e;
    static String field_h;
    private RandomAccessFile field_f;
    static String field_a;
    private long field_i;
    private long field_d;

    final int a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
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
              if (param1 <= -33) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            L2: {
              var5_int = this.field_f.read(param0, param2, param3);
              if (0 >= var5_int) {
                break L2;
              } else {
                this.field_d = this.field_d + (long)var5_int;
                break L2;
              }
            }
            stackOut_4_0 = var5_int;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("hf.G(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    public static void b(int param0) {
        field_g = null;
        field_h = null;
        field_c = null;
        if (param0 != 12741) {
          field_g = (String) null;
          field_a = null;
          field_b = null;
          field_e = (ck[][]) null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_e = (ck[][]) null;
          return;
        }
    }

    final void a(int param0) throws IOException {
        String discarded$2 = null;
        CharSequence[] var3 = null;
        L0: {
          if (this.field_f != null) {
            this.field_f.close();
            this.field_f = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -4) {
          var3 = (CharSequence[]) null;
          discarded$2 = hf.a(-21, 99, (CharSequence[]) null, (byte) 32);
          return;
        } else {
          return;
        }
    }

    protected final void finalize() throws Throwable {
        if (!(null == this.field_f)) {
            System.out.println("");
            this.a(-86);
        }
    }

    final void a(long param0, int param1) throws IOException {
        String discarded$2 = null;
        CharSequence[] var5 = null;
        this.field_f.seek(param0);
        this.field_d = param0;
        if (param1 < 3) {
          var5 = (CharSequence[]) null;
          discarded$2 = hf.a(69, 18, (CharSequence[]) null, (byte) 126);
          return;
        } else {
          return;
        }
    }

    final static String a(int param0, int param1, CharSequence[] param2, byte param3) {
        String discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        CharSequence var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence[] var10 = null;
        CharSequence var11 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_26_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (-1 != (param0 ^ -1)) {
              if (param0 != 1) {
                var4_int = param0 + param1;
                var5 = 0;
                var6_int = param1;
                L1: while (true) {
                  L2: {
                    if (var6_int >= var4_int) {
                      break L2;
                    } else {
                      L3: {
                        var7_ref_CharSequence = param2[var6_int];
                        if (var7_ref_CharSequence != null) {
                          var5 = var5 + var7_ref_CharSequence.length();
                          if (var9 == 0) {
                            break L3;
                          } else {
                            var5 += 4;
                            break L3;
                          }
                        } else {
                          var5 += 4;
                          break L3;
                        }
                      }
                      var6_int++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    var6 = new StringBuilder(var5);
                    if (param3 == 74) {
                      break L4;
                    } else {
                      var10 = (CharSequence[]) null;
                      discarded$4 = hf.a(-7, 123, (CharSequence[]) null, (byte) 21);
                      break L4;
                    }
                  }
                  var7 = param1;
                  L5: while (true) {
                    L6: {
                      if (var7 >= var4_int) {
                        break L6;
                      } else {
                        L7: {
                          var8 = param2[var7];
                          if (var8 == null) {
                            discarded$5 = var6.append("null");
                            break L7;
                          } else {
                            discarded$6 = var6.append(var8);
                            if (var9 == 0) {
                              break L7;
                            } else {
                              discarded$7 = var6.append("null");
                              break L7;
                            }
                          }
                        }
                        var7++;
                        if (var9 == 0) {
                          continue L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackOut_26_0 = var6.toString();
                    stackIn_27_0 = stackOut_26_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                var11 = param2[param1];
                var4_ref = var11;
                if (var4_ref == null) {
                  stackOut_7_0 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return var11.toString();
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("hf.D(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_27_0;
          }
        }
    }

    final long a(byte param0) throws IOException {
        if (param0 != -50) {
            return -2L;
        }
        return this.field_f.length();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        try {
            if (!(((long)param3 - -this.field_d ^ -1L) >= (this.field_i ^ -1L))) {
                this.field_f.seek(this.field_i);
                this.field_f.write(1);
                throw new EOFException();
            }
            int var5_int = 96 % ((param1 - -35) / 49);
            this.field_f.write(param0, param2, param3);
            this.field_d = this.field_d + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "hf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    hf(File param0, String param1, long param2) throws IOException {
        boolean discarded$0 = false;
        int var5_int = 0;
        try {
            if (-1L == param2) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                discarded$0 = param0.delete();
            }
            this.field_f = new RandomAccessFile(param0, param1);
            this.field_d = 0L;
            this.field_i = param2;
            var5_int = this.field_f.read();
            if (var5_int != -1) {
                if (!param1.equals("r")) {
                    this.field_f.seek(0L);
                    this.field_f.write(var5_int);
                }
            }
            this.field_f.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Visit the Account Management section on the main site to view.";
        field_a = "<%0>'s game";
        field_h = "Report abuse";
        field_e = new ck[8][];
        field_g = "No players";
        field_c = "<%0> has joined your game.";
    }
}
