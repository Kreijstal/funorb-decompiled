/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ug implements Iterable {
    static String field_a;
    int field_e;
    private jb field_b;
    static String field_d;
    jb[] field_c;

    final static void a(byte param0) {
        try {
            IOException iOException = null;
            int var1_int = 0;
            RuntimeException var1 = null;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = CrazyCrystals.field_B;
            try {
              L0: {
                L1: {
                  if (null != oi.field_d) {
                    oi.field_d.a((byte) 43);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null != hc.field_a) {
                    hc.field_a.a(-3);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null != fj.field_c) {
                    try {
                      L4: {
                        fj.field_c.d(-200000001);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (param0 == -127) {
                    break L6;
                  } else {
                    ug.a((byte) 124);
                    break L6;
                  }
                }
                L7: {
                  if (li.field_d != null) {
                    var1_int = 0;
                    L8: while (true) {
                      if (var1_int >= li.field_d.length) {
                        break L7;
                      } else {
                        if (li.field_d[var1_int] != null) {
                          try {
                            L9: {
                              li.field_d[var1_int].d(-200000001);
                              break L9;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L10: {
                              var2 = (IOException) (Object) decompiledCaughtException;
                              break L10;
                            }
                          }
                          var1_int++;
                          continue L8;
                        } else {
                          var1_int++;
                          continue L8;
                        }
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw dn.a((Throwable) ((Object) var1), "ug.B(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ii((ug) (this)));
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != 32) {
            field_d = (String) null;
        }
        field_a = null;
    }

    final static String a(int param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = CrazyCrystals.field_B;
        String var6 = "(" + fl.field_m + " " + ea.field_n + " " + qn.field_u + ") " + bf.field_b;
        String var1 = var6;
        if (param0 != -1815) {
            return (String) null;
        }
        if ((rk.field_b ^ -1) < -1) {
            var1 = var6 + ":";
            for (var2 = 0; rk.field_b > var2; var2++) {
                var7 = var1 + ' ';
                var3 = kd.field_n.field_h[var2] & 255;
                var4 = var3 >> 1055252964;
                var3 = var3 & 15;
                if ((var4 ^ -1) > -11) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                var8 = var7 + (char)var4;
                if (10 > var3) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var8 + (char)var3;
            }
        }
        return var1;
    }

    final jb a(long param0, int param1) {
        jb var6 = null;
        int var7 = CrazyCrystals.field_B;
        jb var4 = this.field_c[(int)((long)(-1 + this.field_e) & param0)];
        int var5 = -65 % ((param1 - -31) / 54);
        this.field_b = var4.field_b;
        while (var4 != this.field_b) {
            if (!(param0 != this.field_b.field_e)) {
                var6 = this.field_b;
                this.field_b = this.field_b.field_b;
                return var6;
            }
            this.field_b = this.field_b.field_b;
        }
        this.field_b = null;
        return null;
    }

    private ug() throws Throwable {
        throw new Error();
    }

    final void a(long param0, byte param1, jb param2) {
        jb var5 = null;
        try {
            if (!(null == param2.field_d)) {
                param2.a(false);
            }
            var5 = this.field_c[(int)((long)(-1 + this.field_e) & param0)];
            param2.field_b = var5;
            param2.field_d = var5.field_d;
            if (param1 != 42) {
                field_a = (String) null;
            }
            param2.field_d.field_b = param2;
            param2.field_b.field_d = param2;
            param2.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ug.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_d = "Members only";
    }
}
