/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pl {
    static String field_c;
    static String field_b;
    static int field_g;
    static int field_h;
    static String[] field_k;
    private long field_l;
    private long field_i;
    static float[][] field_f;
    static int field_j;
    static boolean field_d;
    static vk field_e;
    private RandomAccessFile field_a;

    final int a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_a.read(param1, param0, param3);
              if ((var5_int ^ -1) < -1) {
                this.field_i = this.field_i + (long)var5_int;
                break L1;
              } else {
                break L1;
              }
            }
            if (param2 < -125) {
              stackOut_6_0 = var5_int;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_4_0 = 32;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("pl.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void a(int param0, long param1) throws IOException {
        this.field_a.seek(param1);
        if (param0 != 0) {
            this.field_a = (RandomAccessFile) null;
            this.field_i = param1;
            return;
        }
        this.field_i = param1;
    }

    final long c(byte param0) throws IOException {
        int var2 = 82 % ((param0 - 69) / 51);
        return this.field_a.length();
    }

    final void a(int param0, byte param1, byte[] param2, int param3) throws IOException {
        String discarded$0 = null;
        try {
            if (!(((long)param3 + this.field_i ^ -1L) >= (this.field_l ^ -1L))) {
                this.field_a.seek(this.field_l);
                this.field_a.write(1);
                throw new EOFException();
            }
            this.field_a.write(param2, param0, param3);
            if (param1 != 68) {
                CharSequence var6 = (CharSequence) null;
                discarded$0 = pl.a((byte) -58, (CharSequence) null);
            }
            this.field_i = this.field_i + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "pl.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static String a(byte param0) {
        if (ch.field_d != cf.field_b) {
          if (bb.field_a.a(0)) {
            if (cf.field_b != ed.field_c) {
              if (param0 != -69) {
                field_e = (vk) null;
                return bh.field_b;
              } else {
                return bh.field_b;
              }
            } else {
              return bb.field_a.a(true);
            }
          } else {
            return bb.field_a.a(true);
          }
        } else {
          return v.field_b;
        }
    }

    final void a(int param0) throws IOException {
        if (null == this.field_a) {
          if (param0 == 19808) {
            return;
          } else {
            field_j = -18;
            return;
          }
        } else {
          this.field_a.close();
          this.field_a = null;
          if (param0 == 19808) {
            return;
          } else {
            field_j = -18;
            return;
          }
        }
    }

    final static void a(boolean param0, int param1, java.applet.Applet param2, String param3) {
        try {
            String discarded$2 = null;
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            CharSequence var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            try {
              L0: {
                L1: {
                  if (!md.field_f.startsWith("win")) {
                    break L1;
                  } else {
                    if (cg.a(param3, (byte) 30)) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                try {
                  L2: {
                    param2.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                    if (param1 == 12430) {
                      break L2;
                    } else {
                      var5 = (CharSequence) null;
                      discarded$2 = pl.a((byte) -97, (CharSequence) null);
                      return;
                    }
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  kk.a("MGR1: " + param3, (byte) 123, (Throwable) null);
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var4_ref);
                stackOut_9_1 = new StringBuilder().append("pl.I(").append(param0).append(',').append(param1).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param2 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              L4: {
                stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param3 == null) {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L4;
                } else {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L4;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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

    public static void b(byte param0) {
        String discarded$2 = null;
        field_b = null;
        field_k = null;
        field_c = null;
        field_f = (float[][]) null;
        field_e = null;
        if (param0 == -77) {
          return;
        } else {
          discarded$2 = pl.a((byte) -78);
          return;
        }
    }

    final static String a(byte param0, CharSequence param1) {
        StringBuilder discarded$1 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_6_0 = null;
        boolean stackIn_9_0 = false;
        int stackIn_15_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_21_0 = 0;
        boolean stackIn_29_0 = false;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        int stackOut_12_0 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_33_0 = 0;
        boolean stackOut_28_0 = false;
        String stackOut_5_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              if (param0 > 99) {
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var3 <= var2_int) {
                        break L3;
                      } else {
                        stackOut_8_0 = ok.a(-112, param1.charAt(var2_int));
                        stackIn_15_0 = stackOut_8_0 ? 1 : 0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var9 != 0) {
                          break L2;
                        } else {
                          if (!stackIn_9_0) {
                            break L3;
                          } else {
                            var2_int++;
                            continue L1;
                          }
                        }
                      }
                    }
                    stackOut_12_0 = var3;
                    stackIn_15_0 = stackOut_12_0;
                    break L2;
                  }
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (stackIn_15_0 <= var2_int) {
                          break L6;
                        } else {
                          stackOut_16_0 = ok.a(-62, param1.charAt(var3 + -1));
                          stackIn_21_0 = stackOut_16_0 ? 1 : 0;
                          stackIn_17_0 = stackOut_16_0;
                          if (var9 != 0) {
                            break L5;
                          } else {
                            if (!stackIn_17_0) {
                              break L6;
                            } else {
                              var3--;
                              stackOut_14_0 = var3;
                              stackIn_15_0 = stackOut_14_0;
                              continue L4;
                            }
                          }
                        }
                      }
                      stackOut_20_0 = -var2_int + var3;
                      stackIn_21_0 = stackOut_20_0;
                      break L5;
                    }
                    var4 = stackIn_21_0;
                    if (var4 >= 1) {
                      if (-13 <= (var4 ^ -1)) {
                        var5 = new StringBuilder(var4);
                        var6 = var2_int;
                        L7: while (true) {
                          L8: {
                            if (var3 <= var6) {
                              stackOut_33_0 = var5.length();
                              stackIn_34_0 = stackOut_33_0;
                              break L8;
                            } else {
                              var7 = param1.charAt(var6);
                              stackOut_28_0 = sl.a(0, (char) var7);
                              stackIn_34_0 = stackOut_28_0 ? 1 : 0;
                              stackIn_29_0 = stackOut_28_0;
                              if (var9 != 0) {
                                break L8;
                              } else {
                                L9: {
                                  if (!stackIn_29_0) {
                                    break L9;
                                  } else {
                                    var8 = qb.a((char) var7, -201);
                                    if (var8 == 0) {
                                      break L9;
                                    } else {
                                      discarded$1 = var5.append((char) var8);
                                      break L9;
                                    }
                                  }
                                }
                                var6++;
                                continue L7;
                              }
                            }
                          }
                          if (stackIn_34_0 != 0) {
                            return var5.toString();
                          } else {
                            return null;
                          }
                        }
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                stackOut_5_0 = (String) null;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var2);
            stackOut_38_1 = new StringBuilder().append("pl.B(").append(param0).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L10;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L10;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        return stackIn_6_0;
    }

    protected final void finalize() throws Throwable {
        if (null == this.field_a) {
            return;
        }
        System.out.println("");
        this.a(19808);
    }

    pl(File param0, String param1, long param2) throws IOException {
        boolean discarded$0 = false;
        int var5_int = 0;
        try {
            if ((param2 ^ -1L) == 0L) {
                param2 = 9223372036854775807L;
            }
            if ((param0.length() ^ -1L) < (param2 ^ -1L)) {
                discarded$0 = param0.delete();
            }
            this.field_a = new RandomAccessFile(param0, param1);
            this.field_l = param2;
            this.field_i = 0L;
            var5_int = this.field_a.read();
            if (0 != (var5_int ^ -1)) {
                if (!param1.equals("r")) {
                    this.field_a.seek(0L);
                    this.field_a.write(var5_int);
                }
            }
            this.field_a.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "pl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Main Menu";
        field_b = "Create";
        field_f = new float[20][2];
    }
}
