/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wk {
    static int field_c;
    private java.util.zip.Inflater field_a;
    static int field_b;

    public wk() {
        this(-1, 1000000, 1000000);
    }

    private wk(int param0, int param1, int param2) {
    }

    final void a(byte[] param0, va param1, int param2) {
        try {
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            RuntimeException var4_ref = null;
            try {
              L0: {
                L1: {
                  if (param1.field_k[param1.field_m] != 31) {
                    break L1;
                  } else {
                    if (116 == (param1.field_k[1 + param1.field_m] ^ -1)) {
                      L2: {
                        if (this.field_a != null) {
                          break L2;
                        } else {
                          this.field_a = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          this.field_a.setInput(param1.field_k, 10 + param1.field_m, -8 + -param1.field_m - 10 + param1.field_k.length);
                          if (param2 == 6912) {
                            this.field_a.inflate(param0);
                            decompiledRegionSelector0 = 1;
                            break L3;
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L3;
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var4 = (Exception) (Object) decompiledCaughtException;
                        this.field_a.reset();
                        throw new RuntimeException("");
                      }
                      if (decompiledRegionSelector0 == 0) {
                        decompiledRegionSelector1 = 0;
                        break L0;
                      } else {
                        this.field_a.reset();
                        decompiledRegionSelector1 = 1;
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var4_ref);

                stackIn_15_1 = new StringBuilder().append("wk.A(");

                if (param0 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L4;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

                if (param1 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L5;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
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

    static {
        field_b = 0;
    }
}
