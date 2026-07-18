/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bg {
    private long field_b;
    private RandomAccessFile field_a;
    static int field_f;
    static int field_g;
    static int field_c;
    private long field_e;
    static nd field_d;

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 5) {
          L0: {
            field_c = -41;
            if ((-param1 & param1) != param1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((-param1 & param1) != param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        try {
            if (!(~((long)param0 + ((bg) this).field_b) >= ~((bg) this).field_e)) {
                ((bg) this).field_a.seek(((bg) this).field_e);
                ((bg) this).field_a.write(1);
                throw new EOFException();
            }
            ((bg) this).field_a.write(param1, param2, param0);
            if (param3 != -17174) {
                ((bg) this).field_a = null;
            }
            ((bg) this).field_b = ((bg) this).field_b + (long)param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "bg.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, long param1) throws IOException {
        ((bg) this).field_a.seek(param1);
        if (param0 <= 29) {
            field_f = 20;
            ((bg) this).field_b = param1;
            return;
        }
        ((bg) this).field_b = param1;
    }

    final void a(byte param0) throws IOException {
        L0: {
          if (((bg) this).field_a != null) {
            ((bg) this).field_a.close();
            ((bg) this).field_a = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 20) {
          boolean discarded$2 = bg.a(105, 68);
          return;
        } else {
          return;
        }
    }

    final static hb a(int param0, String[] param1) {
        RuntimeException var2 = null;
        hb var2_ref = null;
        int var3 = 0;
        hb var4 = null;
        hb var5 = null;
        hb stackIn_48_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        hb stackOut_47_0 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var4 = new hb();
              var5 = var4;
              var2_ref = var5;
              if (!param1[0].equalsIgnoreCase("return")) {
                break L1;
              } else {
                if (param1.length != 1) {
                  throw new IllegalArgumentException();
                } else {
                  var4.field_d = 0;
                  break L1;
                }
              }
            }
            L2: {
              if (!param1[0].equalsIgnoreCase("activate")) {
                if (!param1[0].equalsIgnoreCase("powerups")) {
                  if (!param1[0].equalsIgnoreCase("superpowertype")) {
                    if (!param1[0].equalsIgnoreCase("laps")) {
                      if (param1[0].equalsIgnoreCase("pos")) {
                        if (param1.length == 4) {
                          var2_ref.field_d = 9;
                          var2_ref.field_c = mo.a((CharSequence) (Object) param1[1], (byte) -116);
                          var2_ref.field_b = ka.a(5, param1[2]);
                          var2_ref.field_e = mo.a((CharSequence) (Object) param1[3], (byte) -116);
                          break L2;
                        } else {
                          throw new IllegalArgumentException();
                        }
                      } else {
                        if (param1[0].equalsIgnoreCase("playerzone")) {
                          if (param1.length != 3) {
                            throw new IllegalArgumentException();
                          } else {
                            var2_ref.field_d = 2;
                            var2_ref.field_c = ka.a(5, param1[1]);
                            var2_ref.field_b = mo.a((CharSequence) (Object) param1[2], (byte) -116);
                            break L2;
                          }
                        } else {
                          if (!param1[0].equalsIgnoreCase("missilehit")) {
                            if (!param1[0].equalsIgnoreCase("missilemiss")) {
                              if (param1[0].equalsIgnoreCase("racecomplete")) {
                                if (param1.length == 1) {
                                  var2_ref.field_d = 8;
                                  break L2;
                                } else {
                                  throw new IllegalArgumentException();
                                }
                              } else {
                                break L2;
                              }
                            } else {
                              if (1 == param1.length) {
                                var2_ref.field_d = 7;
                                break L2;
                              } else {
                                throw new IllegalArgumentException();
                              }
                            }
                          } else {
                            if (param1.length != 1) {
                              throw new IllegalArgumentException();
                            } else {
                              var2_ref.field_d = 6;
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      if (4 == param1.length) {
                        var2_ref.field_d = 5;
                        var2_ref.field_c = mo.a((CharSequence) (Object) param1[1], (byte) -116);
                        var2_ref.field_b = ka.a(5, param1[2]);
                        var2_ref.field_e = mo.a((CharSequence) (Object) param1[3], (byte) -116);
                        break L2;
                      } else {
                        throw new IllegalArgumentException();
                      }
                    }
                  } else {
                    if (param1.length == 3) {
                      var4.field_d = 4;
                      var4.field_c = mo.a((CharSequence) (Object) param1[1], (byte) -116);
                      if (!param1[2].equalsIgnoreCase("none")) {
                        var2_ref.field_b = vh.a(114, param1[2]);
                        break L2;
                      } else {
                        var5.field_b = -1;
                        break L2;
                      }
                    } else {
                      throw new IllegalArgumentException();
                    }
                  }
                } else {
                  if (param1.length == 4) {
                    var4.field_d = 3;
                    var4.field_c = vh.a(122, param1[1]);
                    var4.field_b = ka.a(5, param1[2]);
                    var4.field_e = mo.a((CharSequence) (Object) param1[3], (byte) -116);
                    break L2;
                  } else {
                    throw new IllegalArgumentException();
                  }
                }
              } else {
                if (param1.length == 1) {
                  var5.field_d = 1;
                  break L2;
                } else {
                  throw new IllegalArgumentException();
                }
              }
            }
            stackOut_47_0 = (hb) var2_ref;
            stackIn_48_0 = stackOut_47_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var2;
            stackOut_49_1 = new StringBuilder().append("bg.C(").append(0).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param1 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L3;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ')');
        }
        return stackIn_48_0;
    }

    final long a(boolean param0) throws IOException {
        if (param0) {
            return 66L;
        }
        return ((bg) this).field_a.length();
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_c = -44;
            field_d = null;
            return;
        }
        field_d = null;
    }

    protected final void finalize() throws Throwable {
        if (null != ((bg) this).field_a) {
            System.out.println("");
            ((bg) this).a((byte) 20);
        }
    }

    final int b(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_1_0 = 0;
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
            if (param3 == 11812) {
              L1: {
                var5_int = ((bg) this).field_a.read(param1, param0, param2);
                if (var5_int > 0) {
                  ((bg) this).field_b = ((bg) this).field_b + (long)var5_int;
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_6_0 = var5_int;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = -58;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("bg.A(").append(param0).append(',');
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
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    bg(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((bg) this).field_a = new RandomAccessFile(param0, param1);
            ((bg) this).field_e = param2;
            ((bg) this).field_b = 0L;
            var5_int = ((bg) this).field_a.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((bg) this).field_a.seek(0L);
                    ((bg) this).field_a.write(var5_int);
                }
            }
            ((bg) this).field_a.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "bg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        td.a(50, 14195);
    }
}
