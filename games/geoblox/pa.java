/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pa {
    static uj field_b;
    private long field_f;
    static String field_e;
    static String field_a;
    private RandomAccessFile field_d;
    private long field_c;
    static int field_g;

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        try {
            if (((pa) this).field_f < (long)param3 - -((pa) this).field_c) {
                ((pa) this).field_d.seek(((pa) this).field_f);
                ((pa) this).field_d.write(1);
                throw new EOFException();
            }
            if (param2 != 90) {
                pa.b((byte) 102);
            }
            ((pa) this).field_d.write(param0, param1, param3);
            ((pa) this).field_c = ((pa) this).field_c + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "pa.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final int a(int param0, byte[] param1, int param2, boolean param3) throws IOException {
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
              var5_int = ((pa) this).field_d.read(param1, param2, param0);
              if (var5_int <= 0) {
                break L1;
              } else {
                ((pa) this).field_c = ((pa) this).field_c + (long)var5_int;
                break L1;
              }
            }
            L2: {
              if (!param3) {
                break L2;
              } else {
                field_g = -101;
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
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("pa.D(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_5_0;
    }

    final long a(int param0) throws IOException {
        if (param0 != 1) {
            return -83L;
        }
        return ((pa) this).field_d.length();
    }

    public static void b(byte param0) {
        field_e = null;
        if (param0 <= 3) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static boolean a(CharSequence param0, boolean param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        try {
          L0: {
            L1: {
              if (2 > param2) {
                break L1;
              } else {
                if (param2 > 36) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param0.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= var7) {
                      stackOut_38_0 = var5;
                      stackIn_39_0 = stackOut_38_0;
                      break L0;
                    } else {
                      L3: {
                        L4: {
                          var9 = param0.charAt(var8);
                          if (var8 == 0) {
                            if (45 != var9) {
                              if (var9 != 43) {
                                break L4;
                              } else {
                                if (!param1) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L3;
                            }
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (var9 < 48) {
                              break L6;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (var9 < 65) {
                              break L7;
                            } else {
                              if (var9 > 90) {
                                break L7;
                              } else {
                                var9 -= 55;
                                break L5;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 97) {
                              break L8;
                            } else {
                              if (var9 > 122) {
                                break L8;
                              } else {
                                var9 -= 87;
                                break L5;
                              }
                            }
                          }
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0 != 0;
                        }
                        if (var9 >= param2) {
                          stackOut_27_0 = 0;
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0 != 0;
                        } else {
                          L9: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10 = var6 * param2 - -var9;
                          if (var6 != var10 / param2) {
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            return stackIn_35_0 != 0;
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L3;
                          }
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var4;
            stackOut_40_1 = new StringBuilder().append("pa.B(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L10;
            }
          }
          throw t.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 44 + param1 + 44 + param2 + 44 + 87 + 41);
        }
        return stackIn_39_0 != 0;
    }

    protected final void finalize() throws Throwable {
        if (null != ((pa) this).field_d) {
            System.out.println("");
            ((pa) this).a((byte) -5);
        }
    }

    final static void a(String param0, byte param1, boolean param2, java.applet.Applet param3) {
        try {
            int var4_int = 0;
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            try {
              L0: {
                L1: {
                  if (d.field_b.startsWith("win")) {
                    if (!gh.a(param0, false)) {
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    break L1;
                  }
                }
                {
                  L2: {
                    var4_int = -83 / ((param1 - -55) / 62);
                    param3.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_8_0 = (RuntimeException) var4_ref;
                stackOut_8_1 = new StringBuilder().append("pa.F(");
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (param0 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L4;
                } else {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "{...}";
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L4;
                }
              }
              L5: {
                stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44).append(param2).append(44);
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param3 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L5;
                }
              }
              throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    pa(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (~param2 > ~param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((pa) this).field_d = new RandomAccessFile(param0, param1);
            ((pa) this).field_f = param2;
            ((pa) this).field_c = 0L;
            var5_int = ((pa) this).field_d.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((pa) this).field_d.seek(0L);
                    ((pa) this).field_d.write(var5_int);
                }
            }
            ((pa) this).field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "pa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(long param0, boolean param1) throws IOException {
        ((pa) this).field_d.seek(param0);
        ((pa) this).field_c = param0;
        if (!param1) {
            field_e = null;
        }
    }

    final void a(byte param0) throws IOException {
        if (param0 != -5) {
            return;
        }
        if (null != ((pa) this).field_d) {
            ((pa) this).field_d.close();
            ((pa) this).field_d = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new uj();
        field_a = "Score: <%0>";
        field_e = "Waiting for sound effects";
        field_g = 0;
    }
}
