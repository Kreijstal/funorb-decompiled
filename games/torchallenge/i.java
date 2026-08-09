/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i extends ma {
    private boolean field_n;
    static String[] field_p;
    static int field_m;
    private String field_o;
    static long field_q;
    static int field_r;

    public static void g(int param0) {
        field_p = null;
        if (param0 != -14298) {
            field_p = (String[]) null;
        }
    }

    final rj a(byte param0, String param1) {
        ef var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        rj stackIn_2_0 = null;
        rj stackIn_5_0 = null;
        rj stackIn_12_0 = null;
        rj stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (lk.a(param0 ^ -7343, var4)) {
              if (param0 == 24) {
                L1: {
                  if (!param1.equals(this.field_o)) {
                    L2: {
                      var3 = wi.a(param1, (byte) 123);
                      if (var3 == null) {
                        break L2;
                      } else {
                        if (var3.field_g != null) {
                          break L2;
                        } else {
                          this.field_n = var3.field_m;
                          this.field_o = param1;
                          break L1;
                        }
                      }
                    }
                    stackIn_12_0 = jh.field_c;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (this.field_n) {
                    stackIn_17_0 = tf.field_w;
                    break L3;
                  } else {
                    stackIn_17_0 = lk.field_c;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_5_0 = (rj) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = lk.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("i.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 17004) {
          L0: {
            field_p = (String[]) null;
            if (param1 != (-param1 & param1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (param1 != (-param1 & param1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void f(int param0) {
        this.field_o = null;
        if (param0 != 0) {
            this.f(-101);
        }
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        ef var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -24) {
              var5 = (CharSequence) ((Object) param0);
              var3 = id.a(var5, false);
              if (var3 != null) {
                stackIn_6_0 = (String) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0.equals(this.field_o)) {
                    break L1;
                  } else {
                    var4 = wi.a(param0, (byte) 97);
                    if (var4 != null) {
                      if (null == var4.field_g) {
                        this.field_n = var4.field_m;
                        this.field_o = param0;
                        break L1;
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  }
                }
                if (!this.field_n) {
                  stackIn_17_0 = qb.field_f;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return uf.field_l;
                }
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("i.C(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L2;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final static void a(byte[] param0, byte param1, int param2, File param3) throws IOException {
        EOFException eOFException = null;
        DataInputStream var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var4 = new DataInputStream((InputStream) ((Object) new BufferedInputStream((InputStream) ((Object) new FileInputStream(param3)))));
            try {
              L1: {
                var4.readFully(param0, 0, param2);
                break L1;
              }
            } catch (java.io.EOFException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                eOFException = (EOFException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            var4.close();
            if (param1 >= 77) {
              break L0;
            } else {
              i.a(31, -60);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4_ref);

            stackIn_9_1 = new StringBuilder().append("i.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
    }

    i(dj param0) {
        super(param0);
        this.field_n = false;
    }

    static {
        field_p = new String[]{"Runner", "Spitter", "Thudder", "Rocketeer", "Slimer", "Grinder"};
    }
}
