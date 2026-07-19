/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class asa extends aa {
    static String field_d;
    static aba field_a;
    static long field_c;
    im field_b;
    static int field_e;

    public static void a(int param0) {
        field_d = null;
        if (param0 != 20000000) {
            return;
        }
        field_a = null;
    }

    final static Object a(File param0, byte param1) {
        try {
            IOException var2 = null;
            ClassNotFoundException var2_ref = null;
            RuntimeException var2_ref2 = null;
            FileInputStream var2_ref3 = null;
            ObjectInputStream var3 = null;
            Object var4 = null;
            Object stackIn_2_0 = null;
            Object stackIn_5_0 = null;
            Object stackIn_7_0 = null;
            Object stackIn_11_0 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Object stackOut_6_0 = null;
            Object stackOut_4_0 = null;
            Object stackOut_10_0 = null;
            Object stackOut_1_0 = null;
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
                if (param0.exists()) {
                  try {
                    L1: {
                      var2_ref3 = new FileInputStream(param0);
                      var3 = new ObjectInputStream((InputStream) ((Object) var2_ref3));
                      var4 = var3.readObject();
                      if (param1 <= -42) {
                        var3.close();
                        var2_ref3.close();
                        stackOut_6_0 = var4;
                        stackIn_7_0 = stackOut_6_0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        stackOut_4_0 = (Object) null;
                        stackIn_5_0 = stackOut_4_0;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      var2 = (IOException) (Object) decompiledCaughtException;
                      decompiledRegionSelector0 = 2;
                      break L2;
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var2_ref = (ClassNotFoundException) (Object) decompiledCaughtException;
                      decompiledRegionSelector0 = 2;
                      break L3;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      decompiledRegionSelector1 = 3;
                      break L0;
                    } else {
                      stackOut_10_0 = null;
                      stackIn_11_0 = stackOut_10_0;
                      decompiledRegionSelector1 = 1;
                      break L0;
                    }
                  }
                } else {
                  stackOut_1_0 = null;
                  stackIn_2_0 = stackOut_1_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_12_0 = (RuntimeException) (var2_ref2);
                stackOut_12_1 = new StringBuilder().append("asa.B(");
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param0 == null) {
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
              throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_11_0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_5_0;
                } else {
                  return stackIn_7_0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private asa() throws Throwable {
        throw new Error();
    }

    static {
        field_d = "Data array";
        field_c = 20000000L;
        field_a = new aba();
        field_e = 128;
    }
}
