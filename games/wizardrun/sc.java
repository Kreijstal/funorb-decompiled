/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sc extends wl {
    int field_k;
    static String field_i;
    boolean field_j;
    static String field_o;
    int[] field_n;
    static jk field_m;
    static String field_l;

    public static void a() {
        field_l = null;
        field_i = null;
        field_o = null;
        field_m = null;
    }

    final static kl a(int param0, int param1, int param2, boolean param3, boolean param4) {
        try {
            Object var6 = null;
            Object var7 = null;
            fh var8 = null;
            kl stackIn_12_0 = null;
            Throwable decompiledCaughtException = null;
            kl stackOut_11_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (vk.field_p.field_m == null) {
                    break L1;
                  } else {
                    ld.field_e = new si(vk.field_p.field_m, 5200, 0);
                    vk.field_p.field_m = null;
                    var6 = (Object) (Object) new sg(255, ld.field_e, new si(vk.field_p.field_i, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  if (ld.field_e == null) {
                    break L2;
                  } else {
                    L3: {
                      if (null != sl.field_o) {
                        break L3;
                      } else {
                        sl.field_o = new si[vk.field_p.field_f.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (sl.field_o[param0] == null) {
                        sl.field_o[param0] = new si(vk.field_p.field_f[param0], 12000, 0);
                        vk.field_p.field_f[param0] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new sg(param0, ld.field_e, sl.field_o[param0], 2097152);
                    break L2;
                  }
                }
                L5: {
                  var8 = wi.field_L.a(false, 72, (sg) var7, param0, (sg) var6);
                  if (!param4) {
                    break L5;
                  } else {
                    var8.a((byte) -98);
                    break L5;
                  }
                }
                stackOut_11_0 = new kl((hl) (Object) var8, true, param2);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_12_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    sc() {
    }

    final static String a(byte param0, char param1) {
        int var2 = -98 % ((param0 - 74) / 47);
        return String.valueOf(param1);
    }

    final static void a(wc param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        wc var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            if (!param1) {
              if (null != param0.field_h) {
                L1: {
                  L2: {
                    if (param0.field_c != 0) {
                      break L2;
                    } else {
                      if (param0.field_d != 0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var2_int = 0;
                  L3: while (true) {
                    if (ca.field_e <= var2_int) {
                      break L1;
                    } else {
                      L4: {
                        var3 = mi.field_B[var2_int];
                        if (var3.field_i != 2) {
                          break L4;
                        } else {
                          if (param0.field_c != var3.field_c) {
                            break L4;
                          } else {
                            if (var3.field_d != param0.field_d) {
                              break L4;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var2_int++;
                      continue L3;
                    }
                  }
                }
                L5: {
                  if (param0.field_l != null) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ia.a(0, param0);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("sc.A(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
    }

    final static int a(int param0) {
        return ac.field_t;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Creating your account";
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_l = "Start Game";
    }
}
