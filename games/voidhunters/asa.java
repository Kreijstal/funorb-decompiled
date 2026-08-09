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
            Object stackIn_2_0 = null;
            Object stackIn_5_0 = null;
            Object stackIn_7_0 = null;
            Object stackIn_11_0 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            FileInputStream var2 = null;
            IOException var2_ref = null;
            ClassNotFoundException var2_ref2 = null;
            RuntimeException var2_ref3 = null;
            ObjectInputStream var3 = null;
            Object var4 = null;
            try {
              L0: {
                if (param0.exists()) {
                  try {
                    L1: {
                      var2 = new FileInputStream(param0);
                      var3 = new ObjectInputStream((InputStream) ((Object) var2));
                      var4 = var3.readObject();
                      if (param1 <= -42) {
                        var3.close();
                        var2.close();
                        stackIn_7_0 = var4;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        stackIn_5_0 = (Object) null;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      var2_ref = (IOException) (Object) decompiledCaughtException;
                      decompiledRegionSelector0 = 2;
                      break L2;
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var2_ref2 = (ClassNotFoundException) (Object) decompiledCaughtException;
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
                      stackIn_11_0 = null;
                      decompiledRegionSelector1 = 1;
                      break L0;
                    }
                  }
                } else {
                  stackIn_2_0 = null;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L4: {
                var2_ref3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_14_0 = (RuntimeException) (var2_ref3);

                stackIn_14_1 = new StringBuilder().append("asa.B(");

                if (param0 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L4;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
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
