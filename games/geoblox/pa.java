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
            if (this.field_f < (long)param3 - -this.field_c) {
                this.field_d.seek(this.field_f);
                this.field_d.write(1);
                throw new EOFException();
            }
            if (param2 != 90) {
                pa.b((byte) 102);
            }
            this.field_d.write(param0, param1, param3);
            this.field_c = this.field_c + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "pa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(int param0, byte[] param1, int param2, boolean param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_d.read(param1, param2, param0);
              if ((var5_int ^ -1) >= -1) {
                break L1;
              } else {
                this.field_c = this.field_c + (long)var5_int;
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
            stackIn_5_0 = var5_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("pa.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final long a(int param0) throws IOException {
        if (param0 != 1) {
            return -83L;
        }
        return this.field_d.length();
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
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          L0: {
            L1: {
              if (2 > param2) {
                break L1;
              } else {
                if ((param2 ^ -1) < -37) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = param0.length();
                    if (param3 == 87) {
                      break L2;
                    } else {
                      field_b = (uj) null;
                      break L2;
                    }
                  }
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= var7) {
                      stackIn_41_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param0.charAt(var8);
                          if (-1 == (var8 ^ -1)) {
                            if (45 != var9) {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param1) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 > 90) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (var9 > 122) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          stackIn_25_0 = 0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                        if (var9 >= param2) {
                          stackIn_30_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = var6 * param2 - -var9;
                          if (var6 != var10 / param2) {
                            stackIn_37_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          }
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var4);

            stackIn_44_1 = new StringBuilder().append("pa.B(");

            if (param0 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L11;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L11;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_25_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_30_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_37_0 != 0;
            } else {
              return stackIn_41_0 != 0;
            }
          }
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.field_d) {
            System.out.println("");
            this.a((byte) -5);
        }
    }

    final static void a(String param0, byte param1, boolean param2, java.applet.Applet param3) {
        try {
            int var4_int = 0;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            StringBuilder stackIn_13_1 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            try {
              L0: {
                L1: {
                  if (d.field_b.startsWith("win")) {
                    if (!gh.a(param0, false)) {
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
                try {
                  L2: {
                    var4_int = -83 / ((param1 - -55) / 62);
                    param3.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
                    break L2;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                    gi.a((Throwable) null, "MGR1: " + param0, (byte) 125);
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_10_0 = (RuntimeException) (var4_ref);

                stackIn_10_1 = new StringBuilder().append("pa.F(");

                if (param0 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "null";
                  break L4;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L5;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L5;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
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

    pa(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
                param0.delete();
            }
            this.field_d = new RandomAccessFile(param0, param1);
            this.field_f = param2;
            this.field_c = 0L;
            var5_int = this.field_d.read();
            if (0 != (var5_int ^ -1) && !param1.equals("r")) {
                this.field_d.seek(0L);
                this.field_d.write(var5_int);
            }
            this.field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "pa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(long param0, boolean param1) throws IOException {
        this.field_d.seek(param0);
        this.field_c = param0;
        if (!param1) {
            field_e = (String) null;
        }
    }

    final void a(byte param0) throws IOException {
        if (param0 != -5) {
            return;
        }
        if (null != this.field_d) {
            this.field_d.close();
            this.field_d = null;
        }
    }

    static {
        field_b = new uj();
        field_a = "Score: <%0>";
        field_e = "Waiting for sound effects";
        field_g = 0;
    }
}
