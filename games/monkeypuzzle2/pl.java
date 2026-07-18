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
              var5_int = ((pl) this).field_a.read(param1, param0, param3);
              if (var5_int > 0) {
                ((pl) this).field_i = ((pl) this).field_i + (long)var5_int;
                break L1;
              } else {
                break L1;
              }
            }
            if (param2 < -125) {
              stackOut_6_0 = var5_int;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 32;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("pl.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final void a(int param0, long param1) throws IOException {
        ((pl) this).field_a.seek(param1);
        if (param0 != 0) {
            ((pl) this).field_a = null;
            ((pl) this).field_i = param1;
            return;
        }
        ((pl) this).field_i = param1;
    }

    final long c(byte param0) throws IOException {
        int var2 = 82 % ((param0 - 69) / 51);
        return ((pl) this).field_a.length();
    }

    final void a(int param0, byte param1, byte[] param2, int param3) throws IOException {
        try {
            if (!(~((long)param3 + ((pl) this).field_i) >= ~((pl) this).field_l)) {
                ((pl) this).field_a.seek(((pl) this).field_l);
                ((pl) this).field_a.write(1);
                throw new EOFException();
            }
            ((pl) this).field_a.write(param2, param0, param3);
            if (param1 != 68) {
                Object var6 = null;
                String discarded$0 = pl.a((byte) -58, (CharSequence) null);
            }
            ((pl) this).field_i = ((pl) this).field_i + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "pl.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static String a() {
        if (ch.field_d != cf.field_b) {
          if (bb.field_a.a(0)) {
            if (cf.field_b == ed.field_c) {
              return bb.field_a.a(true);
            } else {
              return bh.field_b;
            }
          } else {
            return bb.field_a.a(true);
          }
        } else {
          return v.field_b;
        }
    }

    final void a(int param0) throws IOException {
        if (null == ((pl) this).field_a) {
          if (param0 == 19808) {
            return;
          } else {
            field_j = -18;
            return;
          }
        } else {
          ((pl) this).field_a.close();
          ((pl) this).field_a = null;
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
                if (!md.field_f.startsWith("win")) {
                  break L0;
                } else {
                  int discarded$8 = 30;
                  if (cg.a(param3)) {
                    return;
                  } else {
                    break L0;
                  }
                }
              }
              {
                param2.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_8_0 = (RuntimeException) var4_ref;
                stackOut_8_1 = new StringBuilder().append("pl.I(").append(param0).append(',').append(12430).append(',');
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (param2 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L1;
                } else {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "{...}";
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L1;
                }
              }
              L2: {
                stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
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
                  break L2;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L2;
                }
              }
              throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b() {
        field_b = null;
        field_k = null;
        field_c = null;
        field_f = null;
        field_e = null;
    }

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param1 != null) {
            var2_int = 0;
            var3 = param1.length();
            if (param0 > 99) {
              L0: while (true) {
                L1: {
                  if (var3 <= var2_int) {
                    break L1;
                  } else {
                    if (!ok.a(-112, param1.charAt(var2_int))) {
                      break L1;
                    } else {
                      var2_int++;
                      continue L0;
                    }
                  }
                }
                L2: while (true) {
                  L3: {
                    if (var3 <= var2_int) {
                      break L3;
                    } else {
                      if (!ok.a(-62, param1.charAt(var3 + -1))) {
                        break L3;
                      } else {
                        var3--;
                        continue L2;
                      }
                    }
                  }
                  var4 = -var2_int + var3;
                  if (var4 >= 1) {
                    if (var4 <= 12) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L4: while (true) {
                        if (var3 <= var6) {
                          if (var5.length() != 0) {
                            return var5.toString();
                          } else {
                            return null;
                          }
                        } else {
                          L5: {
                            var7 = param1.charAt(var6);
                            if (!sl.a(0, (char) var7)) {
                              var6++;
                              break L5;
                            } else {
                              int discarded$2 = -201;
                              var8 = qb.a((char) var7);
                              if (var8 == 0) {
                                var6++;
                                break L5;
                              } else {
                                StringBuilder discarded$3 = var5.append((char) var8);
                                var6++;
                                break L5;
                              }
                            }
                          }
                          var6++;
                          continue L4;
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
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (String) (Object) stackIn_6_0;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("pl.B(").append(param0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L6;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L6;
            }
          }
          throw la.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (null == ((pl) this).field_a) {
            return;
        }
        System.out.println("");
        ((pl) this).a(19808);
    }

    pl(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (~param0.length() < ~param2) {
                boolean discarded$0 = param0.delete();
            }
            ((pl) this).field_a = new RandomAccessFile(param0, param1);
            ((pl) this).field_l = param2;
            ((pl) this).field_i = 0L;
            var5_int = ((pl) this).field_a.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((pl) this).field_a.seek(0L);
                    ((pl) this).field_a.write(var5_int);
                }
            }
            ((pl) this).field_a.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "pl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Main Menu";
        field_b = "Create";
        field_f = new float[20][2];
    }
}
