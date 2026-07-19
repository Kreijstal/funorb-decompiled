/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class te extends kj {
    private int field_i;
    private int field_g;
    static String field_f;
    private int field_h;

    final static void c(byte param0) {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            int var1_int = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = BachelorFridge.field_y;
            try {
              L0: {
                L1: {
                  if (aka.field_G == null) {
                    break L1;
                  } else {
                    aka.field_G.c(20);
                    break L1;
                  }
                }
                L2: {
                  if (param0 > 39) {
                    break L2;
                  } else {
                    te.c(26);
                    break L2;
                  }
                }
                L3: {
                  if (null == oea.field_q) {
                    break L3;
                  } else {
                    oea.field_q.a((byte) -36);
                    break L3;
                  }
                }
                L4: {
                  if (null != f.field_a) {
                    try {
                      L5: {
                        f.field_a.d(-120);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L6;
                      }
                    }
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (null != fr.field_m) {
                  var1_int = 0;
                  L7: while (true) {
                    if (fr.field_m.length <= var1_int) {
                      break L0;
                    } else {
                      L8: {
                        if (fr.field_m[var1_int] != null) {
                          try {
                            L9: {
                              fr.field_m[var1_int].d(-7);
                              break L9;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L10: {
                              var2 = (IOException) (Object) decompiledCaughtException;
                              break L10;
                            }
                          }
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var1_int++;
                      continue L7;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw pe.a((Throwable) ((Object) var1_ref), "te.J(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        if (param0 != 35) {
            te.c((byte) -70);
            field_f = null;
            return;
        }
        field_f = null;
    }

    final static int a(int param0, byte param1) {
        String var2 = null;
        int var3 = 0;
        var3 = 70 % ((18 - param1) / 42);
        var2 = lka.field_E[param0][7];
        var2 = var2.trim();
        var2 = var2.toLowerCase();
        if (var2.equals("")) {
          return 0;
        } else {
          return ((ji) ((Object) dl.field_h.a(true, (long)var2.hashCode()))).field_h;
        }
    }

    final boolean b(int param0) {
        boolean discarded$5 = false;
        L0: {
          if ((this.field_g ^ -1) == -61) {
            jja.a(192, -1, 25);
            break L0;
          } else {
            break L0;
          }
        }
        int fieldTemp$4 = this.field_g - 1;
        this.field_g = this.field_g - 1;
        if (fieldTemp$4 < 0) {
          this.field_e.field_h.b((byte) 106, 35, this.field_d, this.field_c);
          jja.a(128, -1, 24);
          return true;
        } else {
          if (param0 <= 21) {
            discarded$5 = this.b(1);
            return false;
          } else {
            return false;
          }
        }
    }

    final static int d(byte param0) {
        if (param0 != 89) {
            field_f = (String) null;
            return dfa.field_b - rs.field_a;
        }
        return dfa.field_b - rs.field_a;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        ee var5 = null;
        int var6 = 0;
        int var7 = 0;
        var4 = this.field_g * ((-(this.field_g * 655360) + 52428800 >> -1986239376) + 400) / 80;
        if (param1 != 0) {
          this.field_h = -112;
          var5 = sv.field_c;
          var6 = -(this.field_g * this.field_i / 80) + param2;
          var7 = -var4 + (param0 + -(this.field_h * this.field_g / 80));
          var5.a(var6, var7 + -64);
          return;
        } else {
          var5 = sv.field_c;
          var6 = -(this.field_g * this.field_i / 80) + param2;
          var7 = -var4 + (param0 + -(this.field_h * this.field_g / 80));
          var5.a(var6, var7 + -64);
          return;
        }
    }

    te(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
            this.field_g = 80;
            this.field_i = kla.a(129, m.field_a, -2147483648) - 64;
            this.field_h = -32 + kla.a(65, m.field_a, -2147483648);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "te.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            te.c((byte) 59);
        }
    }

    static {
        field_f = "Location";
    }
}
